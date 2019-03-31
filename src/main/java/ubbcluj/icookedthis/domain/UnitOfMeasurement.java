package ubbcluj.icookedthis.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

public enum UnitOfMeasurement {

    KG("kg"),
    L("l"),
    OZ("OZ");

    private String value;

    public String getValue() {
        return value;
    }

    UnitOfMeasurement(String value) {
        this.value = value;
    }
}
