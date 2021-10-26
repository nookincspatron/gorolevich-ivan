package ulsu.gorolevichivan.entity.structure;

import lombok.Data;
import ulsu.gorolevichivan.entity.common.Dictionary;

import javax.persistence.*;

@Data
@Entity
@Table(name = "position_units")
public class PositionUnit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title")
    private String title;

    @ManyToOne
    @JoinColumn(name = "division")
    private Dictionary division;
}