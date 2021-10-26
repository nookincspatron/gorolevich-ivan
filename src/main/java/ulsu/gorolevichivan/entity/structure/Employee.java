package ulsu.gorolevichivan.entity.structure;

import lombok.Data;
import ulsu.gorolevichivan.entity.auth.User;
import ulsu.gorolevichivan.entity.general.KPI;
import ulsu.gorolevichivan.entity.general.Task;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private User user;

    @ManyToOne
    @JoinColumn(name = "position")
    private Position position;

    @ManyToOne
    @JoinColumn(name = "performance_indicators")
    private KPI kpi;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "employee_tasks",
            joinColumns = @JoinColumn(name = "employee", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "task", referencedColumnName = "id")
    )
    private List<Task> tasks;
}