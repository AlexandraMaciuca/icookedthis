package ubbcluj.icookedthis.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ubbcluj.icookedthis.domain.Ingredient;
import ubbcluj.icookedthis.dto.IngredientDto;
import ubbcluj.icookedthis.mapper.IngredientMapper;
import ubbcluj.icookedthis.repository.IngredientRepository;

import java.util.UUID;

@Slf4j
@Service
public class IngredientServiceImpl {//implements IngredientService{
   /* private final IngredientRepository ingredientRepository;
    private final IngredientMapper ingredientMapper;

    public IngredientServiceImpl(IngredientRepository ingredientRepository, IngredientMapper ingredientMapper) {
        this.ingredientRepository = ingredientRepository;
        this.ingredientMapper = ingredientMapper;
    }

    @Override
    public IngredientDto addIngredient(final IngredientDto dto) {
        final Ingredient appt = ingredientMapper.toEntity(dto);
        final Ingredient persisted = ingredientRepository.save(appt);
        log.info("Ingredient successfully added");
        return ingredientMapper.toDto(persisted);
    }

    @Override
    public void delete(final UUID id) {
        ingredientRepository.deleteById(id);
        log.info("Appointment deleted");
    }

    @Override
    public IngredientDto findById(UUID id) {
        Ingredient persisted = ingredientRepository.getOne(id);
        log.info("Returning appointment with name: " + persisted.getName());
        return ingredientMapper.toDto(persisted);
    }

    @Override
    public Iterable findAll() {
        return ingredientRepository.findAll();
    }*/
}

