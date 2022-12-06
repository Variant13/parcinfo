package sn.groupeisi.parcinfo.mapper;

import sn.groupeisi.parcinfo.domaine.ApUsers;
import sn.groupeisi.parcinfo.entities.AppUser;

public interface AppUserMapper {

    ApUsers toAppUser(AppUser appUser);
    AppUser fromApUsers(ApUsers apUsers);
}
