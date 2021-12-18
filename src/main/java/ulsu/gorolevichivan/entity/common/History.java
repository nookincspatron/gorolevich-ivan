package ulsu.gorolevichivan.entity.common;

import lombok.Data;
import ulsu.gorolevichivan.entity.general.Comment;
import ulsu.gorolevichivan.entity.general.Project;
import ulsu.gorolevichivan.entity.general.Task;
import ulsu.gorolevichivan.entity.general.TaskManagement;
import ulsu.gorolevichivan.entity.structure.Employee;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "histories")
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "date_create")
    private Timestamp timestamp;

    @ManyToOne
    @JoinColumn(name = "employee")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "project")
    private Project project;

    @ManyToOne
    @JoinColumn(name = "task")
    private Task task;

    @ManyToOne
    @JoinColumn(name = "task_management")
    private TaskManagement taskManagement;

    @ManyToOne
    @JoinColumn(name = "comment")
    private Comment comment;

    @Column(name = "message")
    private String message;
}