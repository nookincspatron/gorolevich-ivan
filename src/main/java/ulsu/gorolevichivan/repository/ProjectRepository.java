package ulsu.gorolevichivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ulsu.gorolevichivan.entity.general.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}