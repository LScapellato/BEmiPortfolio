package com.abmlspring.practica.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Basic
    private String nombre;
    private String apellido;
    private int edad;
    private String telefono;
    private String mail;
    private String descripcion;
    private String imagenurl;
    private Date fecha_nacimiento;
    private String grado;
//    @OneToOne (mappedBy="persona")
//    private ExperienciaLaboral experiencia;
    @OneToMany
    (fetch = FetchType.EAGER, mappedBy="persona",cascade=CascadeType.ALL)
    private Set<Educacion> fk_educacion ;
    
    @OneToMany
    (fetch = FetchType.EAGER, mappedBy="persona",cascade=CascadeType.ALL)
    private Set<Skills> fk_skills ;

    public Persona() { super();
    }

   

    

    public Persona(String nombre, String apellido, int edad, String telefono, String mail, String descripcion, String imagenurl, Date fecha_nacimiento, String grado, Set<Educacion> fk_educacion, Set<Skills> fk_skills) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.mail = mail;
        this.descripcion = descripcion;
        this.imagenurl = imagenurl;
        this.fecha_nacimiento = fecha_nacimiento;
        this.grado = grado;
        this.fk_educacion = fk_educacion;
        this.fk_skills= fk_skills;
    }
    
}   
