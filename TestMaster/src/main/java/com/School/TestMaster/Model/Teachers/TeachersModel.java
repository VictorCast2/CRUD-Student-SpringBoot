package com.School.TestMaster.Model.Teachers;

import com.School.TestMaster.Model.Curso.CursoModel;
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
@Table(name = "Teachers")
public class TeachersModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Basic
    @NonNull
    private String FirstName;
    private String LastName;

    @OneToMany(mappedBy = "Teacher")
    private List<CursoModel> cursos = new ArrayList<>();
}