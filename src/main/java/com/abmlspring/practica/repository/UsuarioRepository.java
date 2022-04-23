
package com.abmlspring.practica.repository;

import com.abmlspring.practica.model.Usuario;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long>{
    
        

    
}
