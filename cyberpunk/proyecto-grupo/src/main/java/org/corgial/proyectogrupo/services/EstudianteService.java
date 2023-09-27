package org.corgial.proyectogrupo.services;

import org.corgial.proyectogrupo.models.Estudiantes;

import java.util.List;

public interface EstudianteService {

    //Declarar métodos
    List<Estudiantes> listadeEstudiantes();
    Estudiantes guardarEstudiantes(Estudiantes nuevoEstudiantes);

}
