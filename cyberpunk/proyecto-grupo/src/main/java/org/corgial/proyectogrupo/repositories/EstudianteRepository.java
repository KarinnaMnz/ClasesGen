package org.corgial.proyectogrupo.repositories;

import org.corgial.proyectogrupo.models.Estudiantes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiantes,Long> {


}
