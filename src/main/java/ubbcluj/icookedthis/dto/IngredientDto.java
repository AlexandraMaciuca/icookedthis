package ubbcluj.icookedthis.dto;

import ubbcluj.icookedthis.domain.Recipe;

import java.util.UUID;

public class IngredientDto {
    private UUID ingredientId;
    private String name;
    private double quantity;
    private String unit;
    private String temperature;
    private Recipe recipe;

    public IngredientDto(UUID ingredientId, String name, double quantity, String unit, String temperature, Recipe recipeId) {
        this.ingredientId = ingredientId;
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
        this.temperature = temperature;
        this.recipe = recipe;
    }

    public UUID getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(UUID ingredientId) {
        this.ingredientId = ingredientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
