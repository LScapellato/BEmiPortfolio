
package com.abmlspring.practica.security.service;


import com.abmlspring.practica.security.entity.Usuario;
import java.util.List;


public interface IUsuarioService {
    
    public List<Usuario> getUsuarios();
    public void saveUsuario (Usuario usuario);
    public void deleteUsuario(Long id);
    public Usuario findUsuario(Long id);

}
