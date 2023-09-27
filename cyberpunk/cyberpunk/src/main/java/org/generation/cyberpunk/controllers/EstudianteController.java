package org.generation.cyberpunk.controllers;


import org.generation.cyberpunk.models.Estudiante;
import org.generation.cyberpunk.services.EstudianteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Controlador que sigue patrón REST
@Controller

//Permite indicar la ruta, en este caso es la ruta base para los estudiantes

public class EstudianteController {


    /* GET
    * POST
    * PUT
    * DELETE
    * PATCH
    * */

    @Autowired
    EstudianteServiceImpl estudianteService;

    @RequestMapping(value = "/estudiantes", method = RequestMethod.GET)
    public String enlistarEstudiantes(Model model){
        List<Estudiante> listaEstudiantes = estudianteService.listadeEstudiantes();
        model.addAttribute("estudiantes", listaEstudiantes);
        return "estudiantes";
    }

    @GetMapping("/registro")
    public String mostrarFormulario(Model model) { //Model sirve para mapear algun objeto a la vista que estemos manejando
        model.addAttribute("estudiante", new Estudiante());
        return "registro";

    }
    //Controlador se va a encargar de guardar
    @PostMapping("/nuevo")
    public String guardarEstudiante(@ModelAttribute Estudiante nuevoEstudiante){
       //Va a llamar al service y el método de guardar estudiante
        estudianteService.guardarEstudiante(nuevoEstudiante);
        return "redirect:/index";
    }


    //Controlador que se va a encargar de borrar por id
    @PostMapping("/borrar/{id}")
    public String borrarEstudiantePorId(@PathVariable Long id) {
        estudianteService.borrarEstudiante(id);
        return"redirect:/estudiantes";
    }


}
