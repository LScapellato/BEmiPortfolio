
package com.abmlspring.practica.service;

import com.abmlspring.practica.model.Educacion;
import java.util.List;

public interface IEducacionService {
    
    
    public List <Educacion> getEducacion();
    public void saveEducacion(Educacion educacion);
    public void deleteEducacion(int id);
    public Educacion findEducacion (int id);
    
}
