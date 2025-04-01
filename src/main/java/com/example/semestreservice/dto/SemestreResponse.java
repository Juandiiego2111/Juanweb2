package com.example.semestreservice.dto;

import java.time.LocalDate;

public record SemestreResponse(
        Long id,
        Long idPrograma,
        Integer numeroSemestre,
        LocalDate fechaInicio,
        LocalDate fechaFin,
        boolean activo
) {}