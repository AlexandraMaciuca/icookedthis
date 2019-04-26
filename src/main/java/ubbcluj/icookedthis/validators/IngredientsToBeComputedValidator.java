package ubbcluj.icookedthis.validators;

import org.springframework.stereotype.Component;
import ubbcluj.icookedthis.domain.IngredientToBeComputed;
import ubbcluj.icookedthis.domain.IngredientsToBeComputed;

import java.security.InvalidParameterException;
import java.util.Set;

@Component
public class IngredientsToBeComputedValidator {

    public void validateIngredientToComputeBy(IngredientsToBeComputed ingredients) {
        Set<IngredientToBeComputed> ingredientsList = ingredients.getIngredients();

        final boolean isPresent = ingredientsList.stream()
                .anyMatch(ingredient -> ingredient.getName().equals(ingredients.getIngredientToComputeBy().getName()));

        if (!isPresent) {
            throw new InvalidParameterException("Item to compute by is not present in the ingredients list.");
        }
    }
}
