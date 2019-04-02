package ubbcluj.icookedthis.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;
import lombok.experimental.UtilityClass;

@Getter
@AllArgsConstructor
public enum ErrorType {

    INEXISTENT_INGREDIENT_TO_COMPUTE_BY("Item to compute by is not present in the ingredients list.");

    private String description;

}
