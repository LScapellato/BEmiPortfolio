package com.abmlspring.practica.controller;

import com.abmlspring.practica.model.Persona;
import com.abmlspring.practica.service.IPersonaService;
import java.io.Console;
import java.sql.Date;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {

    @Autowired
    private IPersonaService interPersona;

    @GetMapping("/personas/traer")
    public List<Persona> getPersona() {
        return interPersona.getPersonas();
    }

    @GetMapping("/personas/detalle/{nombre}")
    public Persona getByNombre(@PathVariable("nombre") String nombre) {
//        if(!interPersona.existsByNombre(nombre))
//            return interPersona.notify();

        Persona perso = interPersona.findByNombre(nombre);
        return perso;
    }

    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona perso) {
        interPersona.savePersona(perso);
        //devuelve string mensaje 
        return "La persona fue creada";

    }

    @DeleteMapping("/personas/borrar/{id}")
    public void deletePersona(@PathVariable Long id) {
        interPersona.deletePersona(id);

    }

    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("apellido") String nuevoApellido,
            @RequestParam("edad") int nuevaEdad,
            @RequestParam("fecha_nacimiento") Date nuevoFechaNacimiento,
            @RequestParam("telefono") String nuevoTelefono,
            @RequestParam("mail") String nuevoMail,
            @RequestParam("descripcion") String nuevaDescripcion,
            @RequestParam("imagenurl") String nuevaImagenUrl
    ) {

        //buscamos la persona a editar
        Persona perso = interPersona.findPersona(id);
        //esto puede ir tambien en service 
        perso.setApellido(nuevoApellido);
        perso.setNombre(nuevoNombre);
        perso.setEdad(nuevaEdad);
        perso.setFecha_nacimiento(nuevoFechaNacimiento);
        perso.setMail(nuevoMail);
        perso.setTelefono(nuevoTelefono);
        perso.setDescripcion(nuevaDescripcion);
        perso.setImagenurl(nuevaImagenUrl);
        interPersona.savePersona(perso);

        return perso;

    }

}
