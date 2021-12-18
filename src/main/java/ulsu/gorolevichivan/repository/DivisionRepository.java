package ulsu.gorolevichivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ulsu.gorolevichivan.entity.structure.Division;

@Repository
public interface DivisionRepository extends JpaRepository<Division, Long> {

    Division findFirstById(Long id);

    Division findFirstByTitle(String title);
}