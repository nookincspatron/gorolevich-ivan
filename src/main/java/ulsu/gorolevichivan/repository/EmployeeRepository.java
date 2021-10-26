package ulsu.gorolevichivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ulsu.gorolevichivan.entity.structure.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}