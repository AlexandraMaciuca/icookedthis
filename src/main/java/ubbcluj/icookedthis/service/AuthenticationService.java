package ubbcluj.icookedthis.service;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class AuthenticationService {

    public UUID getAuthenticatedUserId() {
        return UUID.fromString((String) getAuthentication().getPrincipal());
    }

    private static Authentication getAuthentication() {
        return SecurityContextHolder.getContext().getAuthentication();
    }

}
