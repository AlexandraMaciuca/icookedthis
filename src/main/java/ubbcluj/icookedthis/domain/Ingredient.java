package ubbcluj.icookedthis.domain;

import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "ingredient")
public class Ingredient {
    @Id
    private UUID id;
    private String name;
    private double quantity;
    private String unit; // unit of measurement
    private String temperature;

    @ManyToOne(optional = false)
    @JoinColumn(name = "recipe_id", referencedColumnName = "id")
    private Recipe recipe;

    public UUID getIngredientId() {
        return id;
    }

    public void setIngredientId(UUID ingredientId) {
        this.id = ingredientId;
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
