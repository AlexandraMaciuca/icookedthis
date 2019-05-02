package ubbcluj.icookedthis.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ubbcluj.icookedthis.dto.UserDto;
import ubbcluj.icookedthis.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<UserDto> register(@RequestBody UserDto userDto) {
        UserDto userDtoResult = userService.register(userDto);
        return ResponseEntity.ok(userDtoResult);
    }

    @PostMapping("/login")
    public ResponseEntity<UserDto> login(@RequestBody UserDto userDto) {
        UserDto userDtoResult = userService.login(userDto.getEmail(), userDto.getPassword());
        return ResponseEntity.ok(userDtoResult);
    }
}
