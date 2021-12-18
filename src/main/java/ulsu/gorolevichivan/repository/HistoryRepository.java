package ulsu.gorolevichivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ulsu.gorolevichivan.entity.common.History;

@Repository
public interface HistoryRepository extends JpaRepository<History, Long> {
}