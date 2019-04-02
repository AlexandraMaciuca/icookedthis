package ubbcluj.icookedthis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ubbcluj.icookedthis.domain.IngredientToBeComputed;
import ubbcluj.icookedthis.domain.IngredientsToBeComputed;

import java.util.Set;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class IngredientsToBeComputedDto {

    private Set<IngredientToBeComputed> ingredients;

    private IngredientToBeComputed ingredientToComputeBy;

}
