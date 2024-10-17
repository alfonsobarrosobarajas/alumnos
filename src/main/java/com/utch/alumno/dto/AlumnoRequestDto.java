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
public class AlumnoRequestDto {

    private Integer id;
    @JsonProperty("matricula")
    private String matricula;
    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("aPaterno")
    private String aPaterno;
    @JsonProperty("aMaterno")
    private String aMaterno;

}
