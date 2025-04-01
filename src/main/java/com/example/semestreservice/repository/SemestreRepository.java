package com.example.semestreservice.repository;

import com.example.semestreservice.model.Semestre;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SemestreRepository extends JpaRepository<Semestre, Long> {

    // Agrega este método
    List<Semestre> findByIdPrograma(Long idPrograma);

    // Opcional: Método para buscar por programa y número de semestre
    List<Semestre> findByIdProgramaAndNumeroSemestre(Long idPrograma, Integer numeroSemestre);
}