package ulsu.gorolevichivan.entity.general;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "kpi")
public class KPI {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "result_indicator")
    private Double resultIndicator;

    @Column(name = "performance_indicator")
    private Double performanceIndicator;
}