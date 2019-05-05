package ubbcluj.icookedthis.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandling {
/*
    @ExceptionHandler
    private ResponseEntity<ErrorView> handleException(final WebExchangeBindException ex) {
        final String errorMessage = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(FieldError::getDefaultMessage)
                .reduce((a, b) -> a + "\n" + b)
                .orElse("Cannot display errors");
        return new ResponseEntity<>(new ErrorView(ErrorType.VALIDATION_ERROR, errorMessage), HttpStatus.BAD_REQUEST);
    }*/

    @ExceptionHandler
    private ResponseEntity<ErrorView> handleException(final RestRuntimeException ex) {
        return new ResponseEntity<>(new ErrorView(ex.getErrorType(), ex.getMessage()),
                HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler
    private ResponseEntity<ErrorView> handleException(final ResourceNotFoundException ex) {
        return new ResponseEntity<>(new ErrorView(ex.getErrorType(), ex.getMessage()), HttpStatus.NOT_FOUND);
    }

    private ResponseEntity<ErrorView> handleException(final InvalidDataException ex) {
        return new ResponseEntity<>(new ErrorView(ex.getErrorType(), ex.getMessage()), HttpStatus.UNPROCESSABLE_ENTITY);
    }

}
