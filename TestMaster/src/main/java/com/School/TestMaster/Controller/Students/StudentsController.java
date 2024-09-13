package com.School.TestMaster.Controller.Students;

import com.School.TestMaster.Model.Students.StudentsModel;
import com.School.TestMaster.Services.Students.StudentsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("Students")
public class StudentsController {

    @Autowired
    private StudentsServices studentsServices;

    @GetMapping
    public List<StudentsModel> ObtenerEstudiantes() {
        return studentsServices.ObtenerStudents();
    }

    @GetMapping("/{Id}")
    public StudentsModel ObtenerEstudiantePorID(@PathVariable Long Id) {
        return studentsServices.ObtenerStudentPorID(Id);
    }

    @PostMapping
    public StudentsModel GuardarEstudiante(@RequestBody StudentsModel student) {
        return studentsServices.GuardarStudent(student);
    }

    @DeleteMapping("/{Id}")
    public void deleteEstudiante(@PathVariable Long Id) {
        studentsServices.EliminarStudent(Id);
    }

}