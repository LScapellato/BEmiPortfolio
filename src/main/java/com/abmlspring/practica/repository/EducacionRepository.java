
package com.abmlspring.practica.repository;

import com.abmlspring.practica.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository <Educacion, Integer>{ 
    
}
