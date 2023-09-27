package com.bestogrupo.thebestogrupo.services;

import com.bestogrupo.thebestogrupo.models.Comentario;
import com.bestogrupo.thebestogrupo.models.Tarea;
import com.bestogrupo.thebestogrupo.models.Usuario;

public interface ComentarioService {
    //Obtener
    Comentario getComentarioPorId(Long id);

    //Borrar
    void deleteComentarioPorId(Long id);

    //Editar
    void updateComentarioPorId(Long id, Comentario comentario);

    //Create
    void createComentario(Comentario comentario);

}
