package com.utch.alumno.controller;


import com.utch.alumno.dto.AlumnoRequestDto;
import com.utch.alumno.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {


    @Autowired
    private AlumnoService alumnoService;

    @PostMapping
    public ResponseEntity<Object> postAlumno(@RequestBody AlumnoRequestDto alumnoRequestDto) {

        return new ResponseEntity<>(alumnoService.save(alumnoRequestDto), HttpStatus.OK);

    }

}
