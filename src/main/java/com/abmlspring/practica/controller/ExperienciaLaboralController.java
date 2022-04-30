package com.abmlspring.practica.controller;

import com.abmlspring.practica.model.ExperienciaLaboral;
import com.abmlspring.practica.service.IExperienciaLaboralService;
//import java.sql.Date;  al cambiar el metodo post no se necesita declarar el tipo de nuevo
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ExperienciaLaboralController {

    @Autowired
    private IExperienciaLaboralService iExperiencia;
    
    
    @GetMapping("/experiencia/traer")
    public List<ExperienciaLaboral> getExperiencia() {
        return iExperiencia.getExper();
    } 
    
    @GetMapping("/experiencia/detalle/{id}")
    public ExperienciaLaboral getDetalle(@PathVariable int id) {
     ExperienciaLaboral expe  =  iExperiencia.findExperiencia(id);
     return expe;
    } 
    
    
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/experiencia/crear")
    public void crearExperiencia(@RequestBody ExperienciaLaboral experiencia) {
        iExperiencia.saveExperiencia(experiencia);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/experiencia/borrar/{id}")
    public void deleteExperiencia(@PathVariable int id) {
        iExperiencia.deleteExperiencia(id);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/experiencia/editar/{id}")
    public ExperienciaLaboral editExperiencia(@PathVariable("id") int id, @RequestBody ExperienciaLaboral exlab)
//            @RequestParam("nombre_empresa") String nuevoNombreEmpresa,
//            @RequestParam("actual") boolean nuevoActual,
//            @RequestParam("puesto") String nuevoPuesto,
//            @RequestParam("fecha_inicio") Date nuevafechainicio,
//            @RequestParam("fecha_fin") Date nuevafechafin,
//            @RequestParam("descripcion") String nuevaDescripcion,
//            @RequestParam("tipoempleo") String nuevotipoempleo) 
    {
        ExperienciaLaboral expe = iExperiencia.findExperiencia(id);
        expe.setNombre_empresa(exlab.getNombre_empresa());
        expe.setPuesto(exlab.getPuesto());
        expe.setActual(exlab.isActual());
        expe.setDescripcion(exlab.getDescripcion());
        expe.setFecha_inicio(exlab.getFecha_inicio());
        expe.setFecha_fin(exlab.getFecha_fin());
        expe.setTipoempleo(exlab.getTipoempleo());
        
//        expe.setNombre_empresa(nuevoNombreEmpresa);
//        expe.setActual(nuevoActual);
//        expe.setPuesto(nuevoPuesto);
//        expe.setFecha_inicio(nuevafechainicio);
//        expe.setFecha_fin(nuevafechafin);
//        expe.setDescripcion(nuevaDescripcion);
//        expe.setTipoempleo(nuevotipoempleo);

        iExperiencia.saveExperiencia(expe);
        return expe;
    }
}
