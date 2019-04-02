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
                entity.getIngredientId(),
                entity.getName(),
                entity.getQuantity(),
                entity.getUnit(),
                entity.getTemperature(),
                entity.getRecipe()
        );
    }

    public Ingredient toEntity(final IngredientDto dto) {
        return new Ingredient(
                dto.getIngredientId(),
                dto.getName(),
                dto.getQuantity(),
                dto.getUnit(),
                dto.getTemperature(),
                dto.getRecipe()
        );
    }
}
