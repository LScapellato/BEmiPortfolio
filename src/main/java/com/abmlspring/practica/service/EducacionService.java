
package com.abmlspring.practica.service;

import com.abmlspring.practica.model.Educacion;
import com.abmlspring.practica.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {
    
    @Autowired
    private EducacionRepository EducacionRepository;

    @Override
    public List<Educacion> getEducacion() {
        List<Educacion> listaEducacion = EducacionRepository.findAll();
        return listaEducacion;
    }

    @Override
    public void saveEducacion(Educacion educacion) {
        EducacionRepository.save(educacion);
        
    }

    @Override
    public void deleteEducacion(int id) {
        EducacionRepository.deleteById(id);
    }

    
    @Override
    public Educacion findEducacion(int id) {
       Educacion educacion = EducacionRepository.findById(id).orElse(null);
       return educacion;
    }
    
    
    
}
