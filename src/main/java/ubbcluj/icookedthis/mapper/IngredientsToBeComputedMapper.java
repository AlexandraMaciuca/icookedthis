package ubbcluj.icookedthis.mapper;

import org.springframework.stereotype.Component;
import ubbcluj.icookedthis.domain.IngredientsToBeComputed;
import ubbcluj.icookedthis.dto.IngredientsToBeComputedDto;

@Component
public class IngredientsToBeComputedMapper {

    public IngredientsToBeComputedDto toDto(IngredientsToBeComputed entity) {
        return new IngredientsToBeComputedDto(
                entity.getIngredients(),
                entity.getIngredientToComputeBy()
        );
    }

    public IngredientsToBeComputed toEntity(IngredientsToBeComputedDto dto) {
        return new IngredientsToBeComputed(
                dto.getIngredients(),
                dto.getIngredientToComputeBy()
        );
    }
}
