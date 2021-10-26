package ulsu.gorolevichivan.entity.general;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "task")
    private Task task;

    @ManyToOne
    @JoinColumn(name = "task_management")
    private TaskManagement taskManagement;
}