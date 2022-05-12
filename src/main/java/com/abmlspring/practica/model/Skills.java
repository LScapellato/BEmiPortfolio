
package com.abmlspring.practica.model;



import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Skills implements Serializable{
    
    @Id
    @GeneratedValue 
    private int id;
    private String nombre_habilidad ;
    
    private String url_imagen;
    private int valor;
    private String tipo;
    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="persona_id")
    private Persona persona;

    public Skills() {
        super();
    }

    public Skills(String nombre_habilidad, String url_imagen, int valor, String tipo, Persona persona) {
        this.nombre_habilidad = nombre_habilidad;
        this.url_imagen = url_imagen;
        this.valor = valor;
        this.tipo = tipo;
        this.persona = persona;
    }
    
    
    
            
            
}
