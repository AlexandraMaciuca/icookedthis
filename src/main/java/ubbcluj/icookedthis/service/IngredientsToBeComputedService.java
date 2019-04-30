package ubbcluj.icookedthis.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ubbcluj.icookedthis.domain.IngredientToBeComputed;
import ubbcluj.icookedthis.domain.IngredientsToBeComputed;
import ubbcluj.icookedthis.dto.IngredientsToBeComputedDto;
import ubbcluj.icookedthis.mapper.IngredientsToBeComputedMapper;
import ubbcluj.icookedthis.repository.IngredientsToBeComputedRepositoryImpl;
import ubbcluj.icookedthis.validators.IngredientsToBeComputedValidator;

import java.util.Set;

@Slf4j
@Service
public class IngredientsToBeComputedService {
    private final IngredientsToBeComputedRepositoryImpl repository;
    private final IngredientsToBeComputedMapper mapper;
    private final IngredientsToBeComputedValidator validator;

    public IngredientsToBeComputedService(IngredientsToBeComputedRepositoryImpl repository, IngredientsToBeComputedMapper mapper, IngredientsToBeComputedValidator validator) {
        this.repository = repository;
        this.mapper = mapper;
        this.validator = validator;
    }

    public Set<IngredientToBeComputed> computeIngredients(IngredientsToBeComputedDto ingredientsToBeComputedDto) {
        IngredientsToBeComputed ingredients = mapper.toEntity(ingredientsToBeComputedDto);
        validator.validateIngredientToComputeBy(ingredients);
        return repository.computeIngredients(ingredients);
    }
}
