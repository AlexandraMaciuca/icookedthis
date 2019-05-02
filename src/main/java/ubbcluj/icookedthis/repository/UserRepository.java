package ubbcluj.icookedthis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ubbcluj.icookedthis.domain.User;

import javax.validation.constraints.NotNull;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByEmail(@NotNull String email);
}
