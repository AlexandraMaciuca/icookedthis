package ubbcluj.icookedthis.mapper;

import org.springframework.stereotype.Component;
import ubbcluj.icookedthis.domain.User;
import ubbcluj.icookedthis.dto.UserDto;

import java.util.UUID;

@Component
public class UserMapper {

    public User toEntity(UserDto dto){
        return User.builder()
                .id(dto.getId())
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .profileImageId(dto.getProfileImageId())
                .cookingExperience(dto.getCookingExperience())
                .build();
    }

    public UserDto toDto(User entity){
        return UserDto.builder()
                .id(entity.getId())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .email(entity.getEmail())
                .password(entity.getPassword())
                .profileImageId(entity.getProfileImageId())
                .cookingExperience(entity.getCookingExperience())
                .build();
    }

    public UserDto toSimpleDto(final User entity){
        return UserDto.builder()
                .id(entity.getId())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName()).build();
    }

}
