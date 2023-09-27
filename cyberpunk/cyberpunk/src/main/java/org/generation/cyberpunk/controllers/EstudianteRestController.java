package org.generation.cyberpunk.controllers;


import org.generation.cyberpunk.models.Estudiante;
import org.generation.cyberpunk.services.EstudianteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Controlador que sigue patrón REST
@RestController
@RequestMapping("/api")
public class EstudianteRestController {

    @Autowired
    EstudianteServiceImpl estudianteService;

    @GetMapping("/lista")
    public List<Estudiante> listaEstudiantes() {
        //return estudianteService.listadeEstudiantes();
        List<Estudiante> listaMostrar = estudianteService.listadeEstudiantes();
        return listaMostrar;
    }

    @GetMapping("/estudiante/{id}")
    public  Estudiante estudiantePorId(@PathVariable Long id){
        Estudiante estudianteMostrar = estudianteService.buscarEstudiantePorId(id);
        return estudianteMostrar;

    }
    //Crear nuevo estudiante
    @PostMapping("/estudiante/nuevo")
    public Estudiante guardarNuevoEstudiante(@RequestBody Estudiante estudianteNuevo) {//@Requetsbody no// }
        Estudiante estudianteParaGuardar = estudianteService.guardarEstudiante(estudianteNuevo);
        return estudianteParaGuardar;
    }

    //Para borrar
    @DeleteMapping("/estudiante/borrar/{id}")//localhost:8080/api/estudiante/borrar
    public String borrarEstudiantePorId(@RequestParam Long id){
        estudianteService.borrarEstudiante(id);
        return "El estudiante ha sido borrado";
    }

    //Para editar
    @PutMapping("/estudiante/editar/{id}")
    public Estudiante editarEstudiantePorId(@PathVariable Long id,
                                            @RequestBody Estudiante estudianteActualizado) {
        Estudiante estudianteEditado = estudianteService.editarEstudiantePorId(id, estudianteActualizado);
        return estudianteEditado;
    }
}
