package com.utch.alumno.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(setterPrefix = "with")
@AllArgsConstructor
@NoArgsConstructor
public class AlumnoResponseDto {

    private Integer id;
    private String matricula;
    private String nombre;
    @JsonProperty("aPaterno")
    private String aPaterno;
    @JsonProperty("aMaterno")
    private String aMaterno;

}
