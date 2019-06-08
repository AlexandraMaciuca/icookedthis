package ubbcluj.icookedthis.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ubbcluj.icookedthis.domain.User;
import ubbcluj.icookedthis.dto.UserDto;
import ubbcluj.icookedthis.exceptions.InvalidDataException;
import ubbcluj.icookedthis.mapper.UserMapper;
import ubbcluj.icookedthis.repository.UserRepository;
import ubbcluj.icookedthis.validators.UserValidator;

import javax.validation.constraints.NotNull;
import java.util.Optional;

import static ubbcluj.icookedthis.exceptions.ErrorType.BAD_CREDENTIALS;
import static ubbcluj.icookedthis.exceptions.ErrorType.USER_NOT_FOUND;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;
    private final UserValidator userValidator;
    private final BCryptPasswordEncoder passwordEncoder;

    public UserServiceImpl(UserMapper userMapper, UserRepository userRepository, UserValidator userValidator,
                           final BCryptPasswordEncoder passwordEncoder) {
        this.userMapper = userMapper;
        this.userRepository = userRepository;
        this.userValidator = userValidator;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDto register(UserDto userDto) {
        log.info("Attempting to login with dto: " + userDto);

        User user = userMapper.toEntity(userDto);

        String hashedPassword = passwordEncoder.encode(userDto.getPassword());
        user.setPassword(hashedPassword);
        userValidator.validateUserRegistration(user);

        User result = userRepository.save(user);
        result.setPassword(null);
        UserDto resultDto = userMapper.toDto(result);

        log.info("register result : " + resultDto);
        return resultDto;
    }

    @Override
    public UserDto login(@NotNull String email, @NotNull String password) {
        log.info("Attempting to login with email: " + email);

        Optional<User> userOptional = userRepository.findByEmail(email);
        User userResult = userOptional
                .orElseThrow(() -> new InvalidDataException(USER_NOT_FOUND, "User not found."));

        if (!BCrypt.checkpw(password, userResult.getPassword()))
            throw new InvalidDataException(BAD_CREDENTIALS, "Bad credentials.");

        userResult.setPassword(null);
        UserDto appUserDto = userMapper.toDto(userResult);
        log.info("login result : " + appUserDto);
        return appUserDto;
    }
}
