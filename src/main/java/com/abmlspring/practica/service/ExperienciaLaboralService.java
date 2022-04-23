
package com.abmlspring.practica.service;

import com.abmlspring.practica.model.ExperienciaLaboral;
import com.abmlspring.practica.repository.ExperienciaLaboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaLaboralService implements IExperienciaLaboralService {
    
    @Autowired
    private ExperienciaLaboralRepository ExpRepository;

    @Override
    public List<ExperienciaLaboral> getExper() {
        List<ExperienciaLaboral> listaExperiencias = ExpRepository.findAll();
        return listaExperiencias;
    }

    @Override
    public void saveExperiencia(ExperienciaLaboral experiencia) {
        ExpRepository.save(experiencia);
    }

    @Override
    public void deleteExperiencia(int id) {
        ExpRepository.deleteById(id);
    }

    @Override
    public ExperienciaLaboral findExperiencia(int id) {
        ExperienciaLaboral experiencia = ExpRepository.findById(id).orElse(null);
        return experiencia;
    }
}   
