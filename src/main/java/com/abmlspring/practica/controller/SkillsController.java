
package com.abmlspring.practica.controller;

import com.abmlspring.practica.model.Skills;
import com.abmlspring.practica.service.ISkillsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkillsController {
    
    @Autowired ISkillsService iskservice;
    
    @GetMapping ("skills/traer")
    public List<Skills> getSkills() {
        return iskservice.getSkills();
    }
    
    @GetMapping("/skills/detalle/{id}")
    public Skills getSkillsDetalle(@PathVariable int id) {
     Skills skill = iskservice.findSkills(id) ;
     return skill;
    } 
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/skills/crear")
    public void crearSkill(@RequestBody Skills skill) {
        iskservice.saveSkills(skill);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/skills/borrar/{id}")
    public void deleteSkill(@PathVariable int id) {
        iskservice.deleteSkills(id);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/skills/editar/{id}")
    
    public  Skills editSkill(@PathVariable("id") int id, @RequestBody Skills skill){
    
    Skills sk =iskservice.findSkills(id);
    
    sk.setNombre_habilidad(skill.getNombre_habilidad());
    sk.setTipo(skill.getTipo());
    sk.setUrl_imagen(skill.getUrl_imagen());
    sk.setValor(skill.getValor());
    
    iskservice.saveSkills(skill);
    return skill;
    
    }
    
    
}
