package org.generation.cyberpunk.services;


import org.generation.cyberpunk.models.Estudiante;

import java.util.List;

//Interfaz para declarar métodos
public interface EstudianteService {

    List<Estudiante> listadeEstudiantes();
    Estudiante buscarEstudiantePorId(Long id);
    Estudiante guardarEstudiante(Estudiante estudianteNuevo);

    void borrarEstudiante(Long id);

    Estudiante editarEstudiantePorId(long id, Estudiante estudianteAEditar);

    Estudiante editarEstudiantePorId(Long id, Estudiante estudianteActualizado);
}
