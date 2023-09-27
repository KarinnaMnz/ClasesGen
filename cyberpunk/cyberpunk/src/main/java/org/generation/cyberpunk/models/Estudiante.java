package org.generation.cyberpunk.models;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;


//Le indicamos que esta es una entidad que debe mapearse a la BBDD
@Entity

//Asignar un nombre a la tabla
@Table(name = "estudiantes_cyberpunk")
public class Estudiante {

    @Id //Le indicamos que es la clave primaria de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Generar el ID de manera autoincrementable
    private Long estudianteId;

    @Column(name = "nombre") //Asignar un nombre a la columna
    @NotNull
    //@Size(min = 5, max=10) --> Para poner límites
    private String estudianteNombre;

    @Min(value = 18, message = "No se puede ingresar menores de 18")
    // Viene de la librería de javax validation, permite indicar un valor mín
    @NotNull(message = "Debes ingresar una edad")
    private Integer estudianteEdad;

    @Email(message = "Introdujiste un correo inválido")
    @NotNull
    private String email;

    //Anotación para indicar relación de muchos a uno
    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "cursosid")
    private Curso curso;

    @ManyToMany
    @JoinTable(//Anotación para la creación de la tabla relacional
            name= "estudiantes_hobbies", //indicamos el nombre de la tabla
            joinColumns = @JoinColumn(name = "estudiante_id"), //Indicamos la columna que lleva la FK de este modelo
            inverseJoinColumns = @JoinColumn(name="hobby_id") //La columna que lleva la
    )
    private List<Hobby> hobbiesEstudiante;

    public Estudiante() {

    }

    public Estudiante(String estudianteNombre, Integer estudianteEdad, String email) {
        this.estudianteNombre = estudianteNombre;
        this.estudianteEdad = estudianteEdad;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}


