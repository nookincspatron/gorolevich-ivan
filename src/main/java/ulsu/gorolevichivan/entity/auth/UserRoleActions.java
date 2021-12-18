package ulsu.gorolevichivan.entity.auth;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import ulsu.gorolevichivan.entity.auth.actions.StructureActions;
import ulsu.gorolevichivan.entity.auth.actions.ProjectActions;
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
    private ProjectActions projectActions;

    @Embedded
    @JsonSerialize
    private TaskActions taskActions;

    @Embedded
    @JsonSerialize
    private StructureActions structureActions;
}