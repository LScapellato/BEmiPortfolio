package com.abmlspring.practica.service;

import com.abmlspring.practica.model.Usuario;
import com.abmlspring.practica.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired //anotacion para implementar dependencias
    public UsuarioRepository userRepo;

    @Override
    public List<Usuario> getUsuarios() {
        return userRepo.findAll();
    }

    @Override
    public void saveUsuario(Usuario user) {
        userRepo.save(user);
    }

    @Override
    public void deleteUsuario(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public Usuario findUsuario(Long id) {
        return userRepo.findById(id).orElse(null);

    }

}
  
   
    
    
    
 

    
    
    
    
    
    

