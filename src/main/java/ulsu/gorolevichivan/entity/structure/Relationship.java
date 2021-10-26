package ulsu.gorolevichivan.entity.structure;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "relationships")
public class Relationship {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "minor")
    private Employee minor;

    @ManyToOne
    @JoinColumn(name = "major")
    private Employee major;
}