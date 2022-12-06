package sn.groupeisi.parcinfo.domaine;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApRoles {

    private Long id;
    @NotNull
    private String nom;

}
