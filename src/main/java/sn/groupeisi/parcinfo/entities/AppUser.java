package sn.groupeisi.parcinfo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true,nullable = false,length = 15)
    private String firstName;
    @Column(unique = true,nullable = false,length = 15)
    private String lastName;
    private String email;
    private String password;
    @ManyToMany
    private List<AppRole> appRoleEntities;
}
