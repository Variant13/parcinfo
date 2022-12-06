package sn.groupeisi.parcinfo.mapper;

import org.mapstruct.Mapper;
import sn.groupeisi.parcinfo.domaine.ApRoles;
import sn.groupeisi.parcinfo.entities.AppRole;

@Mapper
public interface AppRoleMapper {
        ApRoles toAppRole(AppRole appRole);
        AppRole fromApRoles(ApRoles aRoles);
}
