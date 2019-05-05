package ubbcluj.icookedthis.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import ubbcluj.icookedthis.dto.RecipeDto;
import ubbcluj.icookedthis.service.RecipeService;

import java.net.URI;
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
    public List<RecipeDto> findAll() {
        return recipeService.findAll();
    }

    @GetMapping("/{id}")
    public RecipeDto findById(@PathVariable UUID id) {
        return recipeService.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public RecipeDto addRecipe(@RequestBody RecipeDto dto) {
        return recipeService.addRecipe(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteRecipe(@PathVariable UUID id) {
        recipeService.deleteRecipe(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RecipeDto> updateRecipe(@PathVariable UUID id, @RequestBody RecipeDto dto) {
        RecipeDto recipeDto = recipeService.findById(id);
        if (recipeDto == null) {
            return ResponseEntity.notFound().build();
        }
        RecipeDto result = recipeService.updateRecipe(id, dto);

        return ResponseEntity.ok(result);
    }

}
