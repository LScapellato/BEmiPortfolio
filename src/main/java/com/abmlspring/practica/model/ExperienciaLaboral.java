package com.abmlspring.practica.model;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "experiencia_laboral")
public class ExperienciaLaboral implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    
    @NotNull
    private String nombre_empresa;
    private String puesto;
    private boolean actual;
    private Date fecha_inicio;
    private Date fecha_fin;
    private String descripcion;
    private String tipoempleo;
//    @OneToOne(cascade= CascadeType.ALL)
//    @JoinColumn(name ="id")
//    private Persona persona;

    public ExperienciaLaboral() {
    }

    public ExperienciaLaboral(int id, String nombre_empresa, String puesto,
            boolean actual,
            Date fecha_inicio,
            Date fecha_fin,
            String descripcion,
            String tipoempleo) {

        this.id = id;
        this.nombre_empresa = nombre_empresa;
        this.puesto= puesto;
        this.actual = actual;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.descripcion = descripcion;
        this.tipoempleo = tipoempleo;
    }

}
