package ubbcluj.icookedthis.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class IngredientsToBeComputed {
    private Set<IngredientToBeComputed> ingredients;
    private IngredientToBeComputed ingredientToComputeBy;

    public Set<IngredientToBeComputed> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<IngredientToBeComputed> ingredients) {
        this.ingredients = ingredients;
    }

    public IngredientToBeComputed getIngredientToComputeBy() {
        return ingredientToComputeBy;
    }

    public void setIngredientToComputeBy(IngredientToBeComputed ingredientToComputeBy) {
        this.ingredientToComputeBy = ingredientToComputeBy;
    }
}
