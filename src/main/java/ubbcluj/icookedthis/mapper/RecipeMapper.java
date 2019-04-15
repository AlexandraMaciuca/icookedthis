package ubbcluj.icookedthis.mapper;

import org.springframework.stereotype.Component;
import ubbcluj.icookedthis.domain.Recipe;
import ubbcluj.icookedthis.dto.RecipeDto;

@Component
public class RecipeMapper {

    private final IngredientMapper ingredientMapper;

    public RecipeMapper(IngredientMapper ingredientMapper) {
        this.ingredientMapper = ingredientMapper;
    }

    public Recipe toEntity(RecipeDto dto) {
        return Recipe.builder()
                .id(dto.getId())
                .title(dto.getTitle())
                .description(dto.getDescription())
                .time(dto.getTime())
                .recommendedFor(dto.getRecommendedFor())
                .photoId(dto.getPhotoId())
                .date(dto.getDate())
                .build();
    }

    public RecipeDto toDto(Recipe recipe) {
        return RecipeDto.builder()
                .id(recipe.getId())
                .title(recipe.getTitle())
                .ingredients(ingredientMapper.toDtos(recipe.getIngredients()))
                .description(recipe.getDescription())
                .time(recipe.getTime())
                .recommendedFor(recipe.getRecommendedFor())
                .date(recipe.getDate())
                .build();
    }
}
