package org.generation.cyberpunk.repositories;

import org.generation.cyberpunk.models.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//el repository es la capa que se va a estar comunicando con la base de datos
@Repository
public interface EstudiantesRepository extends JpaRepository<Estudiante, Long> {
    // es una interfaz porque aca solo se declaran metodos
}