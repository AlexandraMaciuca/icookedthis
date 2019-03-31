package ubbcluj.icookedthis.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ubbcluj.icookedthis.domain.IngredientToBeComputed;
import ubbcluj.icookedthis.domain.IngredientsToBeComputed;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class IngredientsToBeComputedRepositoryImpl {

    public Set<IngredientToBeComputed> computeIngredients(IngredientsToBeComputed ingredientsToBeComputed) {
        // TO DO improvement : try to set the final quantity in the initial list
        // and return that list instead of creating a new one

        Set<IngredientToBeComputed> computedIngredients = new HashSet<>();

        IngredientToBeComputed initialComputeBy = findIngredientToComputeByInList(ingredientsToBeComputed);
        IngredientToBeComputed computeBy = ingredientsToBeComputed.getIngredientToComputeBy();

        for (IngredientToBeComputed ingredient : ingredientsToBeComputed.getIngredients()) {
            double finalQuantity = getComputedQuantity(ingredient.getQuantity(), initialComputeBy.getQuantity(), computeBy.getQuantity());
            IngredientToBeComputed finalIngredient = new IngredientToBeComputed(ingredient.getName(), finalQuantity, ingredient.getUnit());
            computedIngredients.add(finalIngredient);
        }

        return computedIngredients;
    }

    /**
     * Compute the final quantity for an ingredient corresponding to the quantity of the compute-by-ingredient
     *
     * @param initialQuantity          initial quantity of the ingredient to be computed
     * @param computeByInitialQuantity initial quantity of the compute-by-ingredient
     * @param computeByFinalQuantity   final quantity of the compute-by-ingredient
     * @return final quantity for ingredient
     */
    double getComputedQuantity(double initialQuantity, double computeByInitialQuantity, double computeByFinalQuantity) {
        return (initialQuantity * computeByFinalQuantity) / computeByInitialQuantity;
    }

    /**
     * Search for the ingredient to compute by in the ingredients list
     *
     * @param ingredientsToBeComputed list
     * @return found element
     */
    IngredientToBeComputed findIngredientToComputeByInList(IngredientsToBeComputed ingredientsToBeComputed) {
        IngredientToBeComputed computeBy = ingredientsToBeComputed.getIngredientToComputeBy();

        for (IngredientToBeComputed ingredient : ingredientsToBeComputed.getIngredients()) {
            if (ingredient.equals(computeBy))
                return ingredient;
        }

        return null;
    }
}
