package ulsu.gorolevichivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ulsu.gorolevichivan.entity.structure.Position;

@Repository
public interface PositionRepository extends JpaRepository<Position, Long> {

    Position findFirstById(Long id);
}