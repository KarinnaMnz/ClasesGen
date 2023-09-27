package com.bestogrupo.thebestogrupo.repositories;

import com.bestogrupo.thebestogrupo.models.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareaRepository extends JpaRepository<Tarea,Long> {
}
