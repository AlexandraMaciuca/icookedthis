package ubbcluj.icookedthis.dto;

import lombok.*;

import javax.validation.constraints.*;
import java.util.UUID;


@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private UUID id;
    @NotNull
    @NotEmpty
    private String firstName;
    @NotNull
    @NotEmpty
    private String lastName;
    @Email
    private String email;
    @Size(min = 5)
    @NotNull
    private String password;
    private String cookingExperience;
}
