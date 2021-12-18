package ulsu.gorolevichivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ulsu.gorolevichivan.entity.general.TaskManagement;

@Repository
public interface TaskManagementRepository extends JpaRepository<TaskManagement, Long> {
}