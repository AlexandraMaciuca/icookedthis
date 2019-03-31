package ubbcluj.icookedthis.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ubbcluj.icookedthis.domain.IngredientToBeComputed;
import ubbcluj.icookedthis.domain.IngredientsToBeComputed;
import ubbcluj.icookedthis.dto.IngredientsToBeComputedDto;
import ubbcluj.icookedthis.service.IngredientsToBeComputedService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/ingredientcomputer-service")
public class IngredientsToBeComputedController {
    private IngredientsToBeComputedService ingredientsToBeComputedService;

    public IngredientsToBeComputedController(IngredientsToBeComputedService ingredientsToBeComputedService) {
        this.ingredientsToBeComputedService = ingredientsToBeComputedService;
    }

    @PostMapping("/compute")
    @ResponseStatus(HttpStatus.OK)
    public Set<IngredientToBeComputed> compute(@RequestBody IngredientsToBeComputedDto ingredientsDto){
        return ingredientsToBeComputedService.computeIngredients(ingredientsDto);
    }
}
