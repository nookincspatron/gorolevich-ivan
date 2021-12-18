package ulsu.gorolevichivan.entity.structure;

import lombok.Data;
import ulsu.gorolevichivan.entity.auth.User;
import ulsu.gorolevichivan.entity.general.KPI;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email", unique = true)
    private String email;

    @OneToOne
    private User user;

    @ManyToOne
    @JoinColumn(name = "performance_indicators")
    private KPI kpi;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "employee_positions",
            joinColumns = @JoinColumn(name = "employee_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "position_id", referencedColumnName = "id")
    )
    private List<Position> positions;
}