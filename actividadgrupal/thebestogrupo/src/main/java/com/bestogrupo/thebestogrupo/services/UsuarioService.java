package com.bestogrupo.thebestogrupo.services;

import com.bestogrupo.thebestogrupo.models.Tarea;
import com.bestogrupo.thebestogrupo.models.Usuario;

public interface UsuarioService {

    //Obtener
    Usuario getUsuarioPorId(Long id);

    //Borrar
    void deleteUsuarioPorId(Long id);

    //Editar
    void updateUsuarioPorId(Long id, Usuario usuario);

    //Create
    void createUsuario(Usuario usuario);

    void asignarTarea(Long id,Tarea tarea);
}
