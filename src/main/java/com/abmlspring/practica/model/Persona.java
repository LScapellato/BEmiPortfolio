package com.abmlspring.practica.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

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
//    @OneToOne (mappedBy="persona")
//    private ExperienciaLaboral experiencia;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, int edad, String telefono, String mail, String descripcion, String imagenurl, Date fecha_nacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.mail = mail;
        this.descripcion = descripcion;
        this.imagenurl = imagenurl;
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
}
