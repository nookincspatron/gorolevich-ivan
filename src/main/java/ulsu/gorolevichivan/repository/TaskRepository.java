package ulsu.gorolevichivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ulsu.gorolevichivan.entity.general.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}