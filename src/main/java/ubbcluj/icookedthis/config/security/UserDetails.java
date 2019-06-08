package ubbcluj.icookedthis.config.security;

import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;
import java.util.UUID;

@Getter
public class UserDetails extends User {

    private UUID userId;

    public UserDetails() {
        super(null, null, null);
    }

    public UserDetails(final UUID userId, final String username, final String password,
                       final Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
        this.userId = userId;
    }

}
