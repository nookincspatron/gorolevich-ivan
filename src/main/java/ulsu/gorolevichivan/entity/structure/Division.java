package ulsu.gorolevichivan.entity.structure;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "divisions")
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "responsibilities")
    private String responsibilities;
}
