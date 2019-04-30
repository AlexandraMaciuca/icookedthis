package ubbcluj.icookedthis.mapper;

import org.springframework.stereotype.Component;
import ubbcluj.icookedthis.domain.Ingredient;
import ubbcluj.icookedthis.dto.IngredientDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class IngredientMapper {

    public List<IngredientDto> toDtos(final List<Ingredient> entities) {
        return entities.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    public IngredientDto toDto(final Ingredient entity) {
        return new IngredientDto(
                entity.getId(),
                entity.getName(),
                entity.getQuantity(),
                entity.getUnit(),
                entity.getTemperature(),
                null//entity.getRecipe()
        );
    }

    public Ingredient toEntity(final IngredientDto dto) {
        return new Ingredient(
                dto.getId(),
                dto.getName(),
                dto.getQuantity(),
                dto.getUnit(),
                dto.getTemperature(),
                null
                //,dto.getRecipe()
        );
    }

    public List<Ingredient> toEntities(List<IngredientDto> ingredients) {
        return ingredients.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }
}
