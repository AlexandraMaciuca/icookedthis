package ubbcluj.icookedthis.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ubbcluj.icookedthis.domain.Recipe;
import ubbcluj.icookedthis.dto.RecipeDto;
import ubbcluj.icookedthis.mapper.RecipeMapper;
import ubbcluj.icookedthis.repository.RecipeRepository;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;
    private final RecipeMapper recipeMapper;

    public RecipeServiceImpl(RecipeRepository recipeRepository, RecipeMapper recipeMapper) {
        this.recipeRepository = recipeRepository;
        this.recipeMapper = recipeMapper;
    }

    @Override
    public RecipeDto addRecipe(final RecipeDto dto) {
        log.info("Attempting to add recipe with dto : " + dto);
        Recipe recipe = recipeMapper.toEntity(dto);
        recipe.setDate(new Date());
        recipe.getIngredients().forEach((child) -> child.setRecipe(recipe));
        final Recipe persistedRecipe = recipeRepository.save(recipe);

        RecipeDto result = recipeMapper.toDto(persistedRecipe);
        log.info("result : " + result);
        return result;
    }

    @Override
    @Transactional
    public List<RecipeDto> findAll() {
        return recipeRepository.findAll().stream()
                .map(recipeMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public RecipeDto findById(UUID id) {
        log.info("Searching for recipe with id : " + id);
        Recipe recipe = recipeRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(id.toString()));
        RecipeDto dto = recipeMapper.toDto(recipe);
        log.info("result of searching : " + dto);
        return recipeMapper.toDto(recipe);
    }

    @Override
    @Transactional
    public void deleteRecipe(final UUID id) {
        recipeRepository.deleteById(id);
    }
}
