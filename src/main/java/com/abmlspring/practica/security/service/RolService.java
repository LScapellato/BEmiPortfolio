
package com.abmlspring.practica.security.service;

import com.abmlspring.practica.security.entity.Rol;
import com.abmlspring.practica.security.enums.RolName;
import com.abmlspring.practica.security.repository.RolRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class RolService {
    
    @Autowired
    RolRepository rolRepository;
    
    public Optional <Rol> getByRolName(RolName rolName){
        return rolRepository.findByRolName(rolName);
    }
    
    public void save(Rol rol) {
        rolRepository.save(rol);
    }
}
