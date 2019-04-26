package ubbcluj.icookedthis.validators;

import org.apache.commons.validator.routines.EmailValidator;
import org.springframework.stereotype.Component;
import ubbcluj.icookedthis.domain.User;
import ubbcluj.icookedthis.exceptions.ErrorType;
import ubbcluj.icookedthis.exceptions.InvalidDataException;

@Component
public class UserValidator {

    public void validateUserRegistration(final User user){
        validateEmptyAttributes(user);
        validateEmailFormat(user);
        validatePasswordLength(user);
    }

    private void validateEmptyAttributes(final User user) {
        if (user.getEmail().equals("") | user.getFirstName().equals("") | user.getLastName().equals("")
                | user.getCookingExperience().equals("") | user.getPassword().equals("")) {
            throw new InvalidDataException(ErrorType.EMPTY_FIELDS, "Empty fields");
        }
    }

    private void validateEmailFormat(final User user) {
        if (!EmailValidator.getInstance().isValid(user.getEmail())) {
            throw new InvalidDataException(ErrorType.INVALID_EMAIL, "Invalid email.");
        }
    }

    private void validatePasswordLength(final User user) {
        if (user.getPassword().length() < 5) {
            throw new InvalidDataException(ErrorType.SHORT_PASSWORD, "Password is too short.");
        }
    }
}
