package ubbcluj.icookedthis.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CookingExperience {
    CHEF("chef"),
    AMATEUR("amateur"),
    BEGINNER("beginner");

    private String value;
}
