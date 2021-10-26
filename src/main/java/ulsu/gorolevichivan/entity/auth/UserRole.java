package ulsu.gorolevichivan.entity.auth;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user_roles")
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title")
    private String title;

    @OneToOne
    @JoinColumn(name = "user_role_actions")
    private UserRoleActions userRoleActions;
}