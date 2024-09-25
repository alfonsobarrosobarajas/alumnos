package com.utch.alumno.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {


    @GetMapping
    public ResponseEntity<Object> getAlumno(){

        return new ResponseEntity<>("Soy alumno", HttpStatus.OK);

    }

}
