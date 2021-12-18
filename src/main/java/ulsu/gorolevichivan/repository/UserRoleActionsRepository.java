package ulsu.gorolevichivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ulsu.gorolevichivan.entity.auth.UserRoleActions;

@Repository
public interface UserRoleActionsRepository extends JpaRepository<UserRoleActions, Long> {

    UserRoleActions findFirstById(Long id);
}