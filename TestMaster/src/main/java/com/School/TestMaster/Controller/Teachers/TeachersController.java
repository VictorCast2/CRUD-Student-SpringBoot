package com.School.TestMaster.Controller.Teachers;

import com.School.TestMaster.Model.Teachers.TeachersModel;
import com.School.TestMaster.Services.Teachers.TeachersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class TeachersController {
    @Autowired
    private TeachersServices teachersServices;

    @GetMapping
    public List<TeachersModel> ObtenerProfesores() {
        return teachersServices.ObtenerTeachers();
    }

    @GetMapping("/{id}")
    public TeachersModel ObtenerTeachersPorID(@PathVariable Long id) {
        return teachersServices.ObtenerTeachersPorID();
    }

    @PostMapping
    public TeachersModel createTeacher(@RequestBody TeachersModel teacher) {
        return teachersServices.saveTeacher(teacher);
    }

    @PutMapping("/{id}")
    public TeachersModel updateTeacher(@PathVariable Long id, @RequestBody TeachersModel teacher) {
        teacher.setId(id);
        return teachersServices.saveTeacher(teacher);
    }

    @DeleteMapping("/{id}")
    public void deleteTeacher(@PathVariable Long id) {
        teachersServices.deleteTeacher(id);
    }
}