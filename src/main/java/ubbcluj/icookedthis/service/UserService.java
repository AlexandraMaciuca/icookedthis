package ubbcluj.icookedthis.service;

import ubbcluj.icookedthis.dto.UserDto;

import javax.validation.constraints.NotNull;

public interface UserService {
    UserDto register(@NotNull UserDto userDto);
}
