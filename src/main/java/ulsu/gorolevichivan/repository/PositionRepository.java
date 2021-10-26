package ulsu.gorolevichivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ulsu.gorolevichivan.entity.structure.Position;

public interface PositionRepository extends JpaRepository<Position, Long> {
}