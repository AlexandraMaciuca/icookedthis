package ubbcluj.icookedthis.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ubbcluj.icookedthis.domain.Ingredient;
import ubbcluj.icookedthis.domain.Review;
import ubbcluj.icookedthis.domain.User;

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
    private User user;
    private UUID photoId;
    private Date date;

}
