package ubbcluj.icookedthis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ubbcluj.icookedthis.domain.IngredientToBeComputed;

import java.util.Set;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class IngredientToBeComputedDto {
    private String name;
    private double quantity;
    private String unit;

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
}
