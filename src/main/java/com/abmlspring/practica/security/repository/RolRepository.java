
package com.abmlspring.practica.security.repository;

import com.abmlspring.practica.security.entity.Rol;
import com.abmlspring.practica.security.enums.RolName;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository  extends JpaRepository <Rol, Integer>{
   Optional<Rol> findByRolName(RolName rolName);
    
}
