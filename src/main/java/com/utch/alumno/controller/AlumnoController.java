package com.utch.alumno.controller;


import com.utch.alumno.dto.AlumnoDto;
import com.utch.alumno.service.AlumnoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {

    private final AlumnoService alumnoService;


    public AlumnoController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody AlumnoDto alumnoDto) {
        return new ResponseEntity<>(alumnoService.save(alumnoDto), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Object> getAlumno() {

        return new ResponseEntity<>("Soy alumno", HttpStatus.OK);

    }

}
