
package com.abmlspring.practica.repository;

import com.abmlspring.practica.model.ExperienciaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaLaboralRepository extends JpaRepository <ExperienciaLaboral, Integer> {
   
   
    
    
}
