package ubbcluj.icookedthis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ubbcluj.icookedthis.domain.Recipe;

import java.util.UUID;

public interface RecipeRepository extends JpaRepository<Recipe, UUID> {

}
