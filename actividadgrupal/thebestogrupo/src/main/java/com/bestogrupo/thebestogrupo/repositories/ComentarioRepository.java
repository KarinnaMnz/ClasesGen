package com.bestogrupo.thebestogrupo.repositories;

import com.bestogrupo.thebestogrupo.models.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentario,Long> {
}
