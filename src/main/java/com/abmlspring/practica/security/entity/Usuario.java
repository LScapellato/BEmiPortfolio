//
package com.abmlspring.practica.security.entity;
//


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Usuario implements Serializable  {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    
    private Long id;
    
    private String nombre;
    @Column(unique = true)
    private String nombreUsuario;
    @Email
    private String email;
    @NotBlank
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name ="usuario_rol", joinColumns = @JoinColumn(name ="usuario_id"),
            inverseJoinColumns = @JoinColumn(name = "rol_id"))
    private Set<Rol> roles;        

    
   
    
    
    // Revisar me crea nb
    public Usuario() {
        this.roles = new HashSet<>();
    }

    public Usuario(String nombre, String nombreUsuario, String email, String password) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
    }
    
    
    
}
            
    
    
    

