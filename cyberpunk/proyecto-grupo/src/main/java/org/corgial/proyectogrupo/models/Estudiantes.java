package org.corgial.proyectogrupo.models;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name= "estudiantes")
public class Estudiantes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long estudianteId;

    @Column(name= "nombre")
    @NotNull
    private String estudianteNombre;

    @Column(name = "edad")
    @NotNull
    private Integer estudianteEdad;



    public Estudiantes(String estudianteNombre, Integer estudianteEdad) {
        this.estudianteNombre = estudianteNombre;
        this.estudianteEdad = estudianteEdad;
    }

    public Estudiantes() {
    }

    public Long getEstudianteId() {
        return estudianteId;
    }

    public String getEstudianteNombre() {
        return estudianteNombre;
    }

    public void setEstudianteNombre(String estudianteNombre) {
        this.estudianteNombre = estudianteNombre;
    }

    public Integer getEstudianteEdad() {
        return estudianteEdad;
    }

    public void setEstudianteEdad(Integer estudianteEdad) {
        this.estudianteEdad = estudianteEdad;
    }
}
