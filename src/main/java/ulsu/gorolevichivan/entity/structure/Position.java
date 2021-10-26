package ulsu.gorolevichivan.entity.structure;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "positions")
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "responsibilities")
    private String responsibilities;

    @ManyToOne
    @JoinColumn(name = "position_unit")
    private PositionUnit positionUnit;
}