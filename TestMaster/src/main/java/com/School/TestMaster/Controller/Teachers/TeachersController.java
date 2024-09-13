package com.School.TestMaster.Controller.Teachers;

import com.School.TestMaster.Model.Curso.CursoModel;
import com.School.TestMaster.Model.Teachers.TeachersModel;
import com.School.TestMaster.Services.Teachers.TeachersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/Api/Teachers")
public class TeachersController {
    @Autowired
    private TeachersServices teachersServices;

    @GetMapping
    public List<TeachersModel> ObtenerProfesores () {
        return teachersServices.ObtenerTeachers();
    }

    @GetMapping("/{Id}")
    public TeachersModel ObtenerProfesorPorID (@PathVariable Long Id) {
        return teachersServices.ObtenerTeachersPorID(Id);
    }

    @PostMapping
    public TeachersModel GuardarProfesor (@RequestBody TeachersModel Teacher) {
        return teachersServices.GuardarTeachers(Teacher);
    }

    @PutMapping("/{Id}")
    public TeachersModel ActualizarProfesorPorID (@PathVariable Long Id, @RequestBody TeachersModel Teacher) {
        Teacher.setId(Id);
        return teachersServices.GuardarTeachers(Teacher);
    }

    @DeleteMapping("/{Id}")
    public void EliminarProfesor (@PathVariable Long Id) {
        teachersServices.EliminarTeachers(Id);
    }

    /**
     * Agrega un curso a un profesor.
     *
     * @param teacherId el ID del profesor.
     * @param curso el curso a agregar.
     */
    @PostMapping("/agregar/{teacherId}")
    public void AgregarCurso(@PathVariable Long teacherId, @RequestBody CursoModel curso) {
        teachersServices.AgregarCurso(teacherId, curso);
    }

    /**
     * Elimina un curso de un profesor.
     *
     * @param cursoId el ID del curso a eliminar.
     */
    @DeleteMapping("/eliminar/{cursoId}")
    public void eliminarCurso(@PathVariable Long cursoId) {
        teachersServices.EliminarCurso(cursoId);
    }

}