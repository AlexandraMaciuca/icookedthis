package ubbcluj.icookedthis.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.support.WebExchangeBindException;

import java.security.InvalidParameterException;

@RestControllerAdvice
public class ExceptionHandler {

    //@ExceptionHandler
    private ResponseEntity<Error> handleException(final InvalidParameterException ex) {
        return new ResponseEntity<>(new Error(ex.getMessage()), HttpStatus.BAD_REQUEST);
    }
}
