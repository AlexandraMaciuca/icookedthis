package ubbcluj.icookedthis.mapper;

import org.springframework.stereotype.Component;
import ubbcluj.icookedthis.domain.Recipe;
import ubbcluj.icookedthis.dto.RecipeDto;

@Component
public class RecipeMapper {
    private final IngredientMapper ingredientMapper;
    private final UserMapper userMapper;

    public RecipeMapper(IngredientMapper ingredientMapper, UserMapper userMapper) {
        this.ingredientMapper = ingredientMapper;
        this.userMapper = userMapper;
    }

    public Recipe toEntity(RecipeDto dto) {
        return Recipe.builder()
                .id(dto.getId())
                .title(dto.getTitle())
                .description(dto.getDescription())
                .time(dto.getTime())
                .recommendedFor(dto.getRecommendedFor())
                .date(dto.getDate())
                .user(userMapper.toEntity(dto.getUser()))
                .ingredients(ingredientMapper.toEntities(dto.getIngredients()))
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
                .user(userMapper.toSimpleDto(recipe.getUser()))
                .build();
    }

    public RecipeDto toFullDto(Recipe recipe) {
        return RecipeDto.builder()
                .id(recipe.getId())
                .title(recipe.getTitle())
                .ingredients(ingredientMapper.toFullDtos(recipe.getIngredients()))
                .description(recipe.getDescription())
                .time(recipe.getTime())
                .recommendedFor(recipe.getRecommendedFor())
                .date(recipe.getDate())
                .user(userMapper.toSimpleDto(recipe.getUser()))
                .build();
    }
}
