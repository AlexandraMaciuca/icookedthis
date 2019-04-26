package ubbcluj.icookedthis.dto;

import lombok.*;
import ubbcluj.icookedthis.domain.Recipe;

import java.util.UUID;

@Getter
@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IngredientDto {
    private UUID id;
    private String name;
    private double quantity;
    private String unit;
    private String temperature;
    private Recipe recipe;
}
