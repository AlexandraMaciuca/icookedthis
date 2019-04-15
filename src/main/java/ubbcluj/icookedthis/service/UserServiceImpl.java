package ubbcluj.icookedthis.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ubbcluj.icookedthis.domain.User;
import ubbcluj.icookedthis.dto.UserDto;
import ubbcluj.icookedthis.mapper.UserMapper;
import ubbcluj.icookedthis.repository.UserRepository;

import java.util.UUID;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;

    public UserServiceImpl(UserMapper userMapper, UserRepository userRepository) {
        this.userMapper = userMapper;
        this.userRepository = userRepository;
    }

    @Override
    public UserDto register(UserDto userDto) {
        User appUser = userMapper.toEntity(userDto);
        //appUser.setId(UUID.randomUUID());
        User result = userRepository.save(appUser);
        result.setPassword(null);
        UserDto resultDto = userMapper.toDto(result);
        return resultDto;
    }
}
