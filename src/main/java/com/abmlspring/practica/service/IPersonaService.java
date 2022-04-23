
package com.abmlspring.practica.service;

import com.abmlspring.practica.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List <Persona> getPersonas();
    public void savePersona(Persona perso);
    public void deletePersona(Long id);
    public Persona findPersona (Long id);
    public Persona findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
    public boolean existsById(Long id);
}
