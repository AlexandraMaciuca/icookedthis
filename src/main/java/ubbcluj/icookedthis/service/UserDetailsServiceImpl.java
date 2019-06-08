package ubbcluj.icookedthis.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import ubbcluj.icookedthis.repository.UserRepository;

import static java.util.Collections.emptyList;

@Component(value = "userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    public UserDetailsServiceImpl(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        ubbcluj.icookedthis.domain.User user = userRepository.findByEmail(email).orElse(null);

        if (user == null) {
            throw new UsernameNotFoundException(email);
        }

        return new ubbcluj.icookedthis.config.security.UserDetails(user.getId(), user.getEmail(), user.getPassword(), emptyList());
    }

}
