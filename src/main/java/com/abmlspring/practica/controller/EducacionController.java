
package com.abmlspring.practica.controller;

import com.abmlspring.practica.model.Educacion;
import com.abmlspring.practica.service.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EducacionController {
    
    @Autowired
    private IEducacionService ieducacionService;
    
    
    @GetMapping ("educacion/traer")
    public List<Educacion> getEducacion() {
        return ieducacionService.getEducacion();
    }
    
    @GetMapping("/educacion/detalle/{id}")
    public Educacion getDetalle(@PathVariable int id) {
     Educacion edu = ieducacionService.findEducacion(id) ;
     return edu;
    } 
    
     @PostMapping("/educacion/crear")
    public void crearEducacion(@RequestBody Educacion educacion) {
        ieducacionService.saveEducacion(educacion);
    }
    
    @DeleteMapping("/educacion/borrar/{id}")
    public void deleteEducacion(@PathVariable int id) {
        ieducacionService.deleteEducacion(id);
    }
    
    @PutMapping("/educacion/editar/{id}")
    
    public  Educacion editEducacion(@PathVariable("id") int id, @RequestBody Educacion edu){
    
    Educacion educ =ieducacionService.findEducacion(id);
    
    educ.setInstitucion(edu.getInstitucion());
    educ.setDescripcion(edu.getDescripcion());
    educ.setFecha_inicio(edu.getFecha_fin());
    educ.setFecha_fin(edu.getFecha_fin());
    educ.setTitulo(edu.getTitulo());
    educ.setPersona(edu.getPersona());
    educ.setUrl_imagen(edu.getUrl_imagen());
    ieducacionService.saveEducacion(educ);
    return educ;
    
    }
    
}
