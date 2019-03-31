package ubbcluj.icookedthis.service;


import ubbcluj.icookedthis.dto.IngredientDto;

import java.util.UUID;

public interface IngredientService {

    IngredientDto addIngredient(IngredientDto ingredientDto);

    Iterable findAll();

    IngredientDto findById(UUID ingredientId);

    void delete(UUID ingredientId);
}
