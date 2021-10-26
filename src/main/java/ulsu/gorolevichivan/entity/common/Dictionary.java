package ulsu.gorolevichivan.entity.common;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Dictionary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "code")
    private Long code;

    @Column(name = "type")
    private String type;

    @Column(name = "value")
    private String value;
}