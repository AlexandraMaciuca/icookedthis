package ubbcluj.icookedthis.validators;

import org.apache.commons.validator.routines.EmailValidator;
import org.springframework.stereotype.Component;
import ubbcluj.icookedthis.domain.User;
import ubbcluj.icookedthis.exceptions.ErrorType;
import ubbcluj.icookedthis.exceptions.InvalidDataException;

@Component
public class UserValidator {

    public void validateEmailFormat(final User user) {
        if (!EmailValidator.getInstance().isValid(user.getEmail())) {
            throw new InvalidDataException(ErrorType.INVALID_EMAIL, "Invalid email.");
        }

    }
}
