package ulsu.gorolevichivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ulsu.gorolevichivan.entity.general.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}