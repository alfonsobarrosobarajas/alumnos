package com.utch.alumno.repository;

import com.utch.alumno.Entity.AlumnoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepo extends JpaRepository<AlumnoEntity, Integer> {
}
