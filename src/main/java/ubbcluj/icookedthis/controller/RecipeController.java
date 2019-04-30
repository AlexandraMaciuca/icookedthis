package ubbcluj.icookedthis.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ubbcluj.icookedthis.dto.RecipeDto;
import ubbcluj.icookedthis.dto.UserDto;
import ubbcluj.icookedthis.service.RecipeService;

import java.util.List;
import java.util.UUID;

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

    @GetMapping("/{id}")
    public RecipeDto findById(@PathVariable UUID id){
        return recipeService.findById(id);
    }

    @PostMapping()
    public ResponseEntity<RecipeDto> addRecipe(@RequestBody RecipeDto dto) {
        RecipeDto result = recipeService.addRecipe(dto);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public void deleteRecipe(@PathVariable UUID id){
        recipeService.deleteRecipe(id);
    }
}
