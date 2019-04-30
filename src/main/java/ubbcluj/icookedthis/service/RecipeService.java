package ubbcluj.icookedthis.service;

import ubbcluj.icookedthis.domain.Recipe;
import ubbcluj.icookedthis.dto.RecipeDto;

import java.util.List;
import java.util.UUID;

public interface RecipeService {
    RecipeDto addRecipe(RecipeDto recipeDto);

    List<RecipeDto> findAll();

    //RecipeDto findById(UUID id);

    void deleteRecipe(UUID id);
}
