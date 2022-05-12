/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abmlspring.practica.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;

import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;


import javax.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Educacion implements Serializable {
    
    @Id
    @GeneratedValue 
    private int id;
    
    private String institucion;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_inicio;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_fin;
    private String url_imagen;
    private String titulo;
    private String descripcion;
    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="persona_id")
    private Persona persona;
    
   
    

    public Educacion() { super();
    }

    

    public Educacion(String institucion, Date fecha_inicio, Date fecha_fin, String url_imagen, String titulo, String descripcion, Persona persona) {
        this.institucion = institucion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.url_imagen = url_imagen;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.persona = persona;
    }
    
    
   
    
    
}
