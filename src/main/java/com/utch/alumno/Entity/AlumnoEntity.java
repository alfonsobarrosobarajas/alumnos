package com.utch.alumno.Entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(setterPrefix = "with")
@Entity
@Table(name = "alumno")
public class AlumnoEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String matricula;
    private String nombre;
    private String aPaterno;
    private String aMaterno;

}