package ulsu.gorolevichivan.entity.general;

import lombok.Data;
import ulsu.gorolevichivan.entity.common.Dictionary;
import ulsu.gorolevichivan.entity.structure.Employee;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Data
@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "creation_date")
    private Timestamp creationDate;

    @Column(name = "act_start")
    private Date actStart;

    @Column(name = "act_finish")
    private Date actFinish;

    @Column(name = "exp_start")
    private Date expStart;

    @Column(name = "exp_finish")
    private Date expFinish;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "status")
    private Dictionary status;

    @Column(name = "is_done")
    private Boolean isDone;

    @Column(name = "consumer")
    private String consumer;

    @ManyToOne
    @JoinColumn(name = "manager")
    private Employee manager;
}