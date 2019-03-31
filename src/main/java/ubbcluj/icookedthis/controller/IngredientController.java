package ubbcluj.icookedthis.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ubbcluj.icookedthis.dto.IngredientDto;
import ubbcluj.icookedthis.service.IngredientService;

import java.util.UUID;

@RestController
@RequestMapping("/ingredient-service")
public class IngredientController {
    /*private IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping("/ingredients")
    public Iterable getAllIngredients(){
        return ingredientService.findAll();
    }

    @GetMapping("/ingredient/{id}")
    public IngredientDto findOne(@PathVariable UUID id){
        return ingredientService.findById(id);
    }

    @PostMapping("/ingredient")
    @ResponseStatus(HttpStatus.CREATED)
    public IngredientDto create(@RequestBody IngredientDto ingredientDto){
        return ingredientService.addIngredient(ingredientDto);
    }

    @DeleteMapping("/ingredient/{id}")
    public void delete(@PathVariable UUID id){
        ingredientService.delete(id);
    }
*/
}
