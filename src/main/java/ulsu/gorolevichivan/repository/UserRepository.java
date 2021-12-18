package ulsu.gorolevichivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ulsu.gorolevichivan.entity.auth.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findFirstById(Long id);

    User findFirstByUsername(String username);

}