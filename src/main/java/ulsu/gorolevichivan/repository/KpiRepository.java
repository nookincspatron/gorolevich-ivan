package ulsu.gorolevichivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ulsu.gorolevichivan.entity.general.KPI;

@Repository
public interface KpiRepository extends JpaRepository<KPI, Long> {
}