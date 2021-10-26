package ulsu.gorolevichivan.entity.general;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "task_management")
public class TaskManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "start")
    private Date start;

    @Column(name = "finish")
    private Date finish;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "task")
    private Task task;
}