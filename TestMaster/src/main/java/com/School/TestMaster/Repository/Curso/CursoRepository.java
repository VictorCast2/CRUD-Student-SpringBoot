package com.School.TestMaster.Repository.Curso;

import com.School.TestMaster.Model.Curso.CursoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<CursoModel, Long> {
}