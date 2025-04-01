package com.example.semestreservice.dto;

import jakarta.validation.constraints.*;
import java.time.LocalDate;

public record SemestreRequest(
        @NotNull(message = "El ID del programa es obligatorio")
        Long idPrograma,

        @NotNull(message = "El número de semestre es obligatorio")
        @Min(value = 1, message = "El número de semestre debe ser mínimo 1")
        Integer numeroSemestre,

        @NotNull(message = "La fecha de inicio es obligatoria")
        LocalDate fechaInicio,

        @NotNull(message = "La fecha de fin es obligatoria")
        LocalDate fechaFin
) {}