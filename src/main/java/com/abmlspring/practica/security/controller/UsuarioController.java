//
//package com.abmlspring.practica.security.controller;
//
//
//import com.abmlspring.practica.security.entity.Usuario;
//import com.abmlspring.practica.security.service.IUsuarioService;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import org.springframework.web.bind.annotation.RestController;
//
//
//
//@RestController
//public class UsuarioController {
//    
//    @Autowired
//    private IUsuarioService interUsuario;
//    
//    @GetMapping ("/usuario/user")
//    @ResponseBody
//    public List<Usuario> getUsuarios(){
//    return interUsuario.getUsuarios();
//    }
//    
//    @DeleteMapping ("/delete/{id}")
//    public void deletePersona(@PathVariable int id) {
//        interUsuario.deleteUsuario(id);
//    };
//    
//    @PostMapping ("/usuario/crear")
//    public void agregarPersona(@RequestBody Usuario user) {
//    interUsuario.saveUsuario(user);
//    //devuelve string mensaje 
//    
//    }
//    
//    
//    
//}
