package sn.groupeisi.parcinfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.groupeisi.parcinfo.entities.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser,Long> {
}
