package ubbcluj.icookedthis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ubbcluj.icookedthis.dto.RecipeDto;
import ubbcluj.icookedthis.service.RecipeService;

import java.util.List;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    private RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping()
    public List<RecipeDto> findAll(){
        return recipeService.findAll();
    }
}
