package ulsu.gorolevichivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ulsu.gorolevichivan.entity.auth.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
}