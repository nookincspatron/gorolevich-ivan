package ulsu.gorolevichivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ulsu.gorolevichivan.entity.auth.UserRoleActions;

public interface UserRoleActionsRepository extends JpaRepository<UserRoleActions, Long> {
}