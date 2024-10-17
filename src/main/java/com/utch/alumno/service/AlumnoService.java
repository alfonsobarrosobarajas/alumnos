package com.utch.alumno.service;


import com.utch.alumno.dto.AlumnoRequestDto;
import com.utch.alumno.dto.AlumnoResponseDto;
import com.utch.alumno.entity.AlumnoEntity;
import com.utch.alumno.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    public AlumnoResponseDto save(AlumnoRequestDto alumnoRequestDto) {

        return entityToDto(alumnoRepository.save(dtoToEntity(alumnoRequestDto)));

    }

    private AlumnoEntity dtoToEntity(AlumnoRequestDto alumnoRequestDto) {
        return AlumnoEntity.builder()
                .withMatricula(alumnoRequestDto.getMatricula())
                .withNombre(alumnoRequestDto.getNombre())
                .withAPaterno(alumnoRequestDto.getAPaterno())
                .withAmaterno(alumnoRequestDto.getAMaterno())
                .build();
    }

    private AlumnoResponseDto entityToDto(AlumnoEntity alumnoEntity) {
        return AlumnoResponseDto.builder()
                .withId(alumnoEntity.getId())
                .withNombre(alumnoEntity.getNombre())
                .withMatricula(alumnoEntity.getMatricula())
                .withAPaterno(alumnoEntity.getAPaterno())
                .withAMaterno(alumnoEntity.getAmaterno())
                .build();
    }

}
