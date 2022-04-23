
package com.abmlspring.practica.service;

import com.abmlspring.practica.model.Persona;
import com.abmlspring.practica.repository.PersonaRepository;
import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class PersonaService implements IPersonaService {
    
    @Autowired
    PersonaRepository persoRepository;
    
    @Override
    public List<Persona> getPersonas() {
    List<Persona> listaPersonas = persoRepository.findAll();
    return listaPersonas;
    }
    
    
    
    @Override
    public void savePersona(Persona perso) {
    persoRepository.save(perso);
    }
    
    @Override
    public void deletePersona(Long id) {
    persoRepository.deleteById(id);
    }
    
    @Override
    public Persona findPersona(Long id) {
    Persona perso = persoRepository.findById(id).orElse(null);
    return perso;
    }

    @Override
    public Persona findByNombre(String nombre) {
    return persoRepository.findByNombre(nombre);
    
    }

    @Override
    public boolean existsById(Long id) {
        return persoRepository.existsById(id);
    }

    @Override
    public boolean existsByNombre(String nombre) {
        return persoRepository.existsByNombre(nombre);
    }

}
    

