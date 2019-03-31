package ubbcluj.icookedthis.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ubbcluj.icookedthis.domain.IngredientToBeComputed;
import ubbcluj.icookedthis.dto.IngredientsToBeComputedDto;
import ubbcluj.icookedthis.mapper.IngredientsToBeComputedMapper;
import ubbcluj.icookedthis.repository.IngredientsToBeComputedRepositoryImpl;

import java.util.List;
import java.util.Set;

@Slf4j
@Service
public class IngredientsToBeComputedService {

    private final IngredientsToBeComputedRepositoryImpl repository;
    private final IngredientsToBeComputedMapper mapper;

    public IngredientsToBeComputedService(IngredientsToBeComputedRepositoryImpl repository, IngredientsToBeComputedMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Set<IngredientToBeComputed> computeIngredients(IngredientsToBeComputedDto ingredientsToBeComputedDto){
        return repository.computeIngredients(mapper.toEntity(ingredientsToBeComputedDto));
    }
}
