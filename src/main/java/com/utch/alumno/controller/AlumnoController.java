package com.utch.alumno.controller;


import com.utch.alumno.dto.AlumnoRequestDto;
import com.utch.alumno.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {


    @Autowired
    private AlumnoService alumnoService;

    @PostMapping
    public ResponseEntity<Object> postAlumno(@RequestBody AlumnoRequestDto alumnoRequestDto) {
        return new ResponseEntity<>(alumnoService.save(alumnoRequestDto), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable Integer id) {
        return new ResponseEntity<>(alumnoService.findById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Object> findAll() {
        return new ResponseEntity<>(alumnoService.findAll(), HttpStatus.OK);
    }

}
