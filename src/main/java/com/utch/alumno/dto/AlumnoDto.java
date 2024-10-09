package com.utch.alumno.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(setterPrefix = "with")
public class AlumnoDto {

    private Integer id;
    private String matricula;
    private String nombre;
    private String aPaterno;
    private String aMaterno;

}
