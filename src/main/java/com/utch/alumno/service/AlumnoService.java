package com.utch.alumno.service;

import com.utch.alumno.Entity.AlumnoEntity;
import com.utch.alumno.dto.AlumnoDto;
import com.utch.alumno.repository.AlumnoRepo;
import org.springframework.stereotype.Service;

@Service
public class AlumnoService {


    private final AlumnoRepo alumnoRepo;

    public AlumnoService(AlumnoRepo alumnoRepo) {
        this.alumnoRepo = alumnoRepo;
    }

    public Integer save(AlumnoDto alumnoDto) {

        AlumnoEntity alumnoEntity = dtoToEntity(alumnoDto);
        return alumnoRepo.save(alumnoEntity).getId();
    }

    private AlumnoEntity dtoToEntity(AlumnoDto alumnoDto) {
        return AlumnoEntity.builder()
                .withId(alumnoDto.getId())
                .withMatricula(alumnoDto.getMatricula())
                .withNombre(alumnoDto.getNombre())
                .withAPaterno(alumnoDto.getAPaterno())
                .withAMaterno(alumnoDto.getAMaterno())
                .build();
    }


}
