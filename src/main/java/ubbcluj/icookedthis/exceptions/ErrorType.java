package ubbcluj.icookedthis.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.UtilityClass;

@Getter
@AllArgsConstructor
public enum ErrorType {

    INVALID_EMAIL(Value.INVALID_EMAIL, "Please provide a valid email."),
    USER_NOT_FOUND(Value.USER_NOT_FOUND, "User not found."),
    EMPTY_FIELDS(Value.EMPTY_FIELDS, " Empty fields"),
    BAD_CREDENTIALS(Value.BAD_CREDENTIALS, "Bad credentials."),
    SHORT_PASSWORD(Value.SHORT_PASSWORD, "Password is too short.");

    private String code;
    private String description;

    @UtilityClass
    public class Value {
        private static final String PREFIX = "icookedthis.";
        private static final String INVALID_EMAIL = PREFIX + "100";
        private static final String USER_NOT_FOUND = PREFIX + "101";
        private static final String EMPTY_FIELDS = PREFIX + "102";
        private static final String SHORT_PASSWORD = PREFIX + "103";
        private static final String BAD_CREDENTIALS = PREFIX + "104";
    }

}
