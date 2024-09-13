package com.School.TestMaster.Model.Curso;

import com.School.TestMaster.Model.Students.StudentsModel;
import com.School.TestMaster.Model.Teachers.TeachersModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Curso")
public class CursoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Basic
    @NonNull
    private String Asignatura;
    private Double Note30;
    private Double Note70;

    @ManyToOne
    @JoinColumn(name = "TeacherId")
    private TeachersModel teacher;

    @ManyToMany(mappedBy = "Cursos")
    private List<StudentsModel> students = new ArrayList<>();
}