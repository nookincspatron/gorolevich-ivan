package ulsu.gorolevichivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ulsu.gorolevichivan.entity.common.History;

public interface HistoryRepository extends JpaRepository<History, Long> {
}