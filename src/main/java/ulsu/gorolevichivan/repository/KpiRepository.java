package ulsu.gorolevichivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ulsu.gorolevichivan.entity.general.KPI;

public interface KpiRepository extends JpaRepository<KPI, Long> {
}