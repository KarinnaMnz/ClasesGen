package org.corgial.proyectogrupo.services;

import org.corgial.proyectogrupo.models.Estudiantes;
import org.corgial.proyectogrupo.repositories.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudiantesServicesImpl implements EstudianteService{

    @Autowired
    EstudianteRepository estudianteRepository;

    @Override
    public List<Estudiantes> listadeEstudiantes() {
        return estudianteRepository.findAll();
    }
    @Override
    public Estudiantes guardarEstudiantes(Estudiantes nuevoEstudiantes) {
        if (estudianteRepository.existsById(nuevoEstudiantes.getEstudianteId())) {
            return null;
        }else{
            if (nuevoEstudiantes.getEstudianteEdad() < 18){
                return null;
            }else{
                return estudianteRepository.save(nuevoEstudiantes);
            }
        }
    }
}

