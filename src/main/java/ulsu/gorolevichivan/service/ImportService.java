package ulsu.gorolevichivan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ulsu.gorolevichivan.entity.auth.User;
import ulsu.gorolevichivan.entity.auth.UserRole;
import ulsu.gorolevichivan.entity.auth.UserRoleActions;
import ulsu.gorolevichivan.entity.auth.actions.StructureActions;
import ulsu.gorolevichivan.entity.auth.actions.ProjectActions;
import ulsu.gorolevichivan.entity.auth.actions.TaskActions;
import ulsu.gorolevichivan.entity.structure.Employee;
import ulsu.gorolevichivan.entity.structure.Position;

import java.util.Collections;

import static ulsu.gorolevichivan.service.DictionaryService.*;
import static ulsu.gorolevichivan.service.DivisionService.*;

@Service
public class ImportService {

    private final DictionaryService dictionaryService;
    private final DivisionService divisionService;
    private final EmployeeService employeeService;
    private final PositionService positionService;
    private final UserService userService;
    private final UserRoleService userRoleService;
    private final UserRoleActionsService userRoleActionsService;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public ImportService(
            DictionaryService dictionaryService,
            DivisionService divisionService,
            EmployeeService employeeService,
            PositionService positionService,
            UserService userService,
            UserRoleService userRoleService,
            UserRoleActionsService userRoleActionsService,
            PasswordEncoder passwordEncoder
    ) {
        this.dictionaryService = dictionaryService;
        this.divisionService = divisionService;
        this.employeeService = employeeService;
        this.positionService = positionService;
        this.userService = userService;
        this.userRoleService = userRoleService;
        this.userRoleActionsService = userRoleActionsService;
        this.passwordEncoder = passwordEncoder;
    }

    @EventListener(ApplicationReadyEvent.class)
    @Order(3)
    public void importStatuses() {
        this.dictionaryService.saveIfNotExists(STATUS, STATUS_IN_WORK);
        this.dictionaryService.saveIfNotExists(STATUS, STATUS_COMPLETED);
        this.dictionaryService.saveIfNotExists(STATUS, STATUS_PENDING_REVIEW);
        this.dictionaryService.saveIfNotExists(STATUS, STATUS_ON_REVIEW);
    }

    @EventListener(ApplicationReadyEvent.class)
    @Order(2)
    public void importDivisions() {
        this.divisionService.saveIfNotExists(BACK_END, "Do Back-End");
        this.divisionService.saveIfNotExists(FRONT_END, "Do Front-End");
        this.divisionService.saveIfNotExists(QA, "Do Q&A");
        this.divisionService.saveIfNotExists(DESIGN, "Do Design");
        this.divisionService.saveIfNotExists(PM, "Do PM");
        this.divisionService.saveIfNotExists(HR, "Do HR");
    }

    @EventListener(ApplicationReadyEvent.class)
    @Order(1)
    public void importEmployees() {
        this.seniorPMEmployee();
    }

    public UserRoleActions seniorPMRoleActions() {
        StructureActions structureActions = new StructureActions();
        structureActions.setEmployeeCreate(false);
        structureActions.setEmployeeEdit(false);
        structureActions.setPositionCreate(false);
        structureActions.setPositionEdit(false);
        structureActions.setDivisionCreate(false);
        structureActions.setDivisionEdit(false);

        ProjectActions projectActions = new ProjectActions();
        projectActions.setProjectCreate(true);
        projectActions.setProjectEdit(true);

        TaskActions taskActions = new TaskActions();
        taskActions.setTaskCreate(true);
        taskActions.setTaskDelegate(true);
        taskActions.setTaskReview(true);

        UserRoleActions userRoleActions = new UserRoleActions();
        userRoleActions.setStructureActions(structureActions);
        userRoleActions.setProjectActions(projectActions);
        userRoleActions.setTaskActions(taskActions);

        this.userRoleActionsService.save(userRoleActions);
        return userRoleActions;
    }

    public UserRole seniorPMUserRole() {
        UserRole userRole = new UserRole();
        userRole.setTitle("Senior PM");
        userRole.setUserRoleActions(this.seniorPMRoleActions());
        this.userRoleService.save(userRole);

        return userRole;
    }

    public User seniorPMUser() {
        User user = new User();
        user.setUsername("seniorpm");
        user.setPassword(passwordEncoder.encode("seniorpm"));
        user.setUserRole(this.seniorPMUserRole());

        this.userService.save(user);
        return user;
    }

    public Position seniorPMPosition() {
        Position position = new Position();
        position.setTitle("Senior PM");
        position.setResponsibilities("Do Senior HR");
        position.setDivision(this.divisionService.getHR());

        this.positionService.save(position);
        return position;
    }

    public Employee seniorPMEmployee() {
        Employee employee = new Employee();
        employee.setFirstName("Иван");
        employee.setMiddleName("Павлович");
        employee.setLastName("Горолевич");
        employee.setEmail("nookincspatron@gmail.com");
        employee.setPositions(Collections.singletonList(this.seniorPMPosition()));
        employee.setUser(this.seniorPMUser());

        this.employeeService.save(employee);
        return employee;
    }
}