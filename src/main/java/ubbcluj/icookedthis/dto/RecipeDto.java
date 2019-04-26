package ubbcluj.icookedthis.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RecipeDto {

    private UUID id;
    private String title;
    private List<IngredientDto> ingredients;
    private String description;
    private String time;
    private String recommendedFor; // cooking experience
    private UserDto user;
    private UUID photoId;
    private Date date;

}
