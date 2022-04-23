
package com.abmlspring.practica.repository;

import com.abmlspring.practica.model.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

//Mapeamos como repositorio
//La interface extiende de JpaRepository (maneja repositorios JPA)
//en los parámetros entre <> deben ir _ <clase apersistir, Tipo de dato de Id>
public interface PersonaRepository extends JpaRepository <Persona, Long>{
    Persona findByNombre(String nombre);
    boolean existsByNombre(String nombre);
}
