package ulsu.gorolevichivan.entity.auth;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import ulsu.gorolevichivan.entity.auth.actions.EmployeeActions;
import ulsu.gorolevichivan.entity.auth.actions.PositionActions;
import ulsu.gorolevichivan.entity.auth.actions.PositionUnitActions;
import ulsu.gorolevichivan.entity.auth.actions.TaskActions;

import javax.persistence.*;

@Data
@Entity
public class UserRoleActions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Embedded
    @JsonSerialize
    private TaskActions taskActions;

    @Embedded
    @JsonSerialize
    private EmployeeActions employeeActions;

    @Embedded
    @JsonSerialize
    private PositionActions positionActions;

    @Embedded
    @JsonSerialize
    private PositionUnitActions positionUnitActions;
}