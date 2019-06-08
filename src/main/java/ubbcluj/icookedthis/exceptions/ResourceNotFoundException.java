package ubbcluj.icookedthis.exceptions;

public class ResourceNotFoundException extends RestRuntimeException {

    public ResourceNotFoundException(final ErrorType errorType, final String message) {
        super(errorType, message);
    }

}
