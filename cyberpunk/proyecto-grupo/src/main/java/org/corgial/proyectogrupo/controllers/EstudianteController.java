package org.corgial.proyectogrupo.controllers;


import org.corgial.proyectogrupo.models.Estudiantes;
import org.corgial.proyectogrupo.services.EstudiantesServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class EstudianteController {
    @Autowired
    EstudiantesServicesImpl estudiantesService;

    @RequestMapping(value="/listaEstudiantes", method = RequestMethod.GET)

    public List<Estudiantes> mostrarLista(){
        return estudiantesService.listadeEstudiantes();
    }

}
