package org.generation.cyberpunk.services;

import org.generation.cyberpunk.models.Estudiante;
import org.generation.cyberpunk.repositories.EstudiantesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class EstudianteServiceImpl implements EstudianteService {

    //Inyección de dependencias

    @Autowired
    EstudiantesRepository estudiantesRepository;

    //Método para traer una lista de todos los  registros
    @Override
    public List<Estudiante> listadeEstudiantes() {
        return estudiantesRepository.findAll();
    }

    @Override
    public Estudiante buscarEstudiantePorId(Long id) {
        Boolean existe = estudiantesRepository.existsById(id);

        if (existe) {
            //Optional es una clase que no es el objeto en sí, para obtener e objeto hay otro método
            Estudiante estudianteEscogido = estudiantesRepository.findById(id).get();
            return estudianteEscogido;


        } else {
            System.out.println("El id es inválido o no existe");
            return null;
        }
    }

    @Override
    public Estudiante guardarEstudiante(Estudiante estudianteNuevo) {
        //Verificar si es que el estudiante existe

        if (estudianteNuevo.getEstudianteEdad() < 18) {
            System.out.println("El estudiante debe ser mayor a 18 años");
            return null;
        } else {
            return estudiantesRepository.save(estudianteNuevo);
        }
    }

    //Método para borrar según el id, va a llamar al repository
    @Override
    public void borrarEstudiante(Long id) {
        estudiantesRepository.deleteById(id);

    }

    @Override
    public Estudiante editarEstudiantePorId(long id, Estudiante estudianteAEditar) {
        return null;
    }

    @Override
    public Estudiante editarEstudiantePorId(Long id, Estudiante estudianteActualizado){
        Boolean existe = estudiantesRepository.existsById(id);
        if (existe) {
            //Buscamos al estudiante en la BBDD por su ID y lo guardamos en una variable
            Estudiante estudianteSeleccionado = estudiantesRepository.findById(id).get();
            //Luego, le vamos setando cada campo nuevo, obteniéndolo de estudianteActualizado
            estudianteSeleccionado.setEstudianteEdad(estudianteActualizado.getEstudianteEdad());
            estudianteSeleccionado.setEstudianteNombre(estudianteActualizado.getEstudianteNombre());
            estudianteSeleccionado.setEmail(estudianteActualizado.getEmail());
            System.out.println("El estudiante ha sido actualizado");
            return estudiantesRepository.save(estudianteSeleccionado);
        }else{
            System.out.println("El estudiante no existe o el ID es inválido");
            return null;
        }
    }
}

