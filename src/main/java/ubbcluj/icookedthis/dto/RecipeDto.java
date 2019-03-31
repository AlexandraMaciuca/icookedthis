package ubbcluj.icookedthis.dto;

import ubbcluj.icookedthis.domain.Ingredient;

import java.util.List;
import java.util.UUID;

public class RecipeDto {
    private UUID recipeId;
    private String title;
    private List<Ingredient> ingredients;
    private String description;
    private String time;
    private String recommendedFor; // cooking experience
    private UUID authorId;
    private UUID photoId;

    public RecipeDto(UUID recipeId, String title, List<Ingredient> ingredients, String description, String time, String recommendedFor, UUID authorId, UUID photoId) {
        this.recipeId = recipeId;
        this.title = title;
        this.ingredients = ingredients;
        this.description = description;
        this.time = time;
        this.recommendedFor = recommendedFor;
        this.authorId = authorId;
        this.photoId = photoId;
    }

    public UUID getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(UUID recipeId) {
        this.recipeId = recipeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRecommendedFor() {
        return recommendedFor;
    }

    public void setRecommendedFor(String recommendedFor) {
        this.recommendedFor = recommendedFor;
    }

    public UUID getAuthorId() {
        return authorId;
    }

    public void setAuthorId(UUID authorId) {
        this.authorId = authorId;
    }

    public UUID getPhotoId() {
        return photoId;
    }

    public void setPhotoId(UUID photoId) {
        this.photoId = photoId;
    }
}
