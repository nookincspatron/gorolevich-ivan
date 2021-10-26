package ulsu.gorolevichivan.entity.general;

import lombok.Data;
import ulsu.gorolevichivan.entity.structure.Employee;
import ulsu.gorolevichivan.entity.common.Dictionary;

import javax.persistence.*;
import java.security.Timestamp;
import java.util.Date;

@Data
@Entity
@Table(name = "tasks")
public class Task {

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
    @JoinColumn(name = "division")
    private Dictionary division;

    @ManyToOne
    @JoinColumn(name = "status")
    private Dictionary status;

    @Column(name = "is_done")
    private Boolean isDone;

    @ManyToOne
    @JoinColumn(name = "creator")
    private Employee creator;

    @ManyToOne
    @JoinColumn(name = "performer")
    private Employee performer;

    @ManyToOne
    @JoinColumn(name = "prev_performer")
    private Employee prevPerformer;

    @ManyToOne
    @JoinColumn(name = "prev_reviewer")
    private Employee prevReviewer;
}