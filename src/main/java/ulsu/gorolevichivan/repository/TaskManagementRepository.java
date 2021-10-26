package ulsu.gorolevichivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ulsu.gorolevichivan.entity.general.TaskManagement;

public interface TaskManagementRepository extends JpaRepository<TaskManagement, Long> {
}