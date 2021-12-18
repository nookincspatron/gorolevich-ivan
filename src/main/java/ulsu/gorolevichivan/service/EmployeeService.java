package ulsu.gorolevichivan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ulsu.gorolevichivan.entity.structure.Employee;
import ulsu.gorolevichivan.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(
            EmployeeRepository employeeRepository
    ) {
        this.employeeRepository = employeeRepository;
    }

    public void save(Employee employee) {
        this.employeeRepository.save(employee);
    }

    public Employee findById(Long id) {
        return this.employeeRepository.findFirstById(id);
    }
}