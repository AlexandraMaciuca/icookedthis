package ubbcluj.icookedthis.controller;

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
    public ResponseEntity<RecipeDto> findById(@PathVariable UUID id) {
        RecipeDto result = recipeService.findById(id);
        if (result == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(result);
    }

    @PostMapping()
    public ResponseEntity<Object> addRecipe(@RequestBody RecipeDto dto) {
        RecipeDto result = recipeService.addRecipe(dto);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(result.getId()).toUri();

        return ResponseEntity.created(location).build();
        //return ResponseEntity.ok(result);
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
