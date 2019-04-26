package ubbcluj.icookedthis.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.UtilityClass;

@Getter
@AllArgsConstructor
public enum ErrorType {

    INVALID_EMAIL(Value.INVALID_EMAIL, "Please provide a valid email."),
    USER_DOES_NOT_EXIST(Value.USER_DOES_NOT_EXIST, "User does not exist");

    private String code;
    private String description;

    @UtilityClass
    public class Value {
        private static final String PREFIX = "icookedthis.";
        private static final String INVALID_EMAIL = PREFIX + "100";
        private static final String USER_DOES_NOT_EXIST = PREFIX + "101";
    }

}
