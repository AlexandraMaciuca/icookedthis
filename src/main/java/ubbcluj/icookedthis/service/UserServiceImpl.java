package ubbcluj.icookedthis.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ubbcluj.icookedthis.domain.User;
import ubbcluj.icookedthis.dto.UserDto;
import ubbcluj.icookedthis.mapper.UserMapper;
import ubbcluj.icookedthis.repository.UserRepository;
import ubbcluj.icookedthis.validators.UserValidator;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;
    private final UserValidator userValidator;

    public UserServiceImpl(UserMapper userMapper, UserRepository userRepository, UserValidator userValidator) {
        this.userMapper = userMapper;
        this.userRepository = userRepository;
        this.userValidator = userValidator;
    }

    @Override
    public UserDto register(UserDto userDto) {
        User user = userMapper.toEntity(userDto);
        userValidator.validateEmailFormat(user);

        User result = userRepository.save(user);
        result.setPassword(null);
        UserDto resultDto = userMapper.toDto(result);
        return resultDto;
    }
}
