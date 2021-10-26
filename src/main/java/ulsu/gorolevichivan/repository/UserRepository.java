package ulsu.gorolevichivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ulsu.gorolevichivan.entity.auth.User;

public interface UserRepository extends JpaRepository<User, Long> {
}