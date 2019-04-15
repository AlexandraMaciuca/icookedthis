package ubbcluj.icookedthis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ubbcluj.icookedthis.domain.User;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
