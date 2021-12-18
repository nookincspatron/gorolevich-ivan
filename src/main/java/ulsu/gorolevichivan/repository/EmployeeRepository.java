package ulsu.gorolevichivan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ulsu.gorolevichivan.entity.auth.User;
import ulsu.gorolevichivan.entity.structure.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee findFirstById(Long id);
}