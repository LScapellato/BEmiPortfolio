package com.abmlspring.practica.security.service;


import com.abmlspring.practica.security.entity.Usuario;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.abmlspring.practica.security.repository.UsuarioRepositor;

@Service
@Transactional //para coherencia en bd accesos compartidos
public class UsuarioService {

    @Autowired //anotacion para implementar dependencias
    public UsuarioRepositor userRepo;

    
    public List<Usuario> getUsuarios() {
        return userRepo.findAll();
    }

    
    public void saveUsuario(Usuario user) {
        userRepo.save(user);
    }

    
    public void deleteUsuario(Long id) {
        userRepo.deleteById(id);
    }

    
    public Usuario findUsuario(Long id) {
        return userRepo.findById(id).orElse(null);

    }
    
    public Optional <Usuario> getByNombreUsuario (String nombreUsuario){
        return userRepo.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){
        return userRepo.existsByNombreUsuario(nombreUsuario);
        
    }
    
    public boolean existsByEmail(String email){
        return userRepo.existsByEmail(email);
    }
    
    public Optional <Usuario> getByEmail (String email){
        return userRepo.findByEmail(email);
    }
}
  
   
    
    
    
 

    
    
    
    
    
    

