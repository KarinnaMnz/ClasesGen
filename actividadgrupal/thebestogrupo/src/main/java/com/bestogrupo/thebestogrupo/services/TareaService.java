package com.bestogrupo.thebestogrupo.services;

import com.bestogrupo.thebestogrupo.models.Comentario;
import com.bestogrupo.thebestogrupo.models.Tarea;
import com.bestogrupo.thebestogrupo.models.Usuario;

public interface TareaService {
    //Obtener
    Tarea getTareaPorId(Long id);

    //Borrar
    void deleteTareaPorId(Long id);

    //Editar
    void updateTareaPorId(Long id, Tarea tarea);

    //Create
    void createTarea(Tarea tarea);

    void asignarComentario(Long id, Comentario comentario);
}
