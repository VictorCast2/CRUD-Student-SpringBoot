package com.School.TestMaster.Services.Teachers;

import com.School.TestMaster.Model.Curso.CursoModel;
import com.School.TestMaster.Model.Teachers.TeachersModel;
import com.School.TestMaster.Repository.Curso.CursoRepository;
import com.School.TestMaster.Repository.Teachers.TeachersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class TeachersServices {

    @Autowired
    private TeachersRepository teachersRepository;

    @Autowired
    private CursoRepository cursoRepository;

    /**
     * Obtiene todos los profesores.
     *
     * @return Una lista de todos los modelos de profesores.
     **/
    public List<TeachersModel> ObtenerTeachers() {
        return teachersRepository.findAll();
    }

    /**
     * Obtiene un profesor por su ID.
     *
     * @param Id el ID del profesor a buscar.
     *
     * @return El modelo del profesor si se encuentra, de lo contrario, null.
     **/
    public TeachersModel ObtenerTeachersPorID(Long id) {
        return teachersRepository.findById(id).orElse(null);
    }

    /**
     * Guarda un profesor.
     *
     * @param TeachersModel el modelo del profesor a guardar.
     *
     * @return El modelo del profesor guardado.
     **/
    public TeachersModel GuardarTeachers(TeachersModel teacher) {
        return teachersRepository.save(teacher);
    }

    /**
     * Elimina un profesor por su ID.
     *
     * @param Id El ID del profesor a eliminar.
     **/
    public void EliminarTeachers(Long id) {
        teachersRepository.deleteById(id);
    }

    /**
     * Agrega un curso a un profesor.
     *
     * @param teacherId el ID del profesor.
     * @param curso el curso a agregar.
     **/
    public void AgregarCurso(Long teacherId, CursoModel curso) {
        TeachersModel teacher = teachersRepository.findById(teacherId).orElse(null);
        if (teacher != null) {
            curso.setTeacher(teacher);
            cursoRepository.save(curso);
        }
    }

    /**
     * Elimina un curso de un profesor.
     *
     * @param cursoId el ID del curso a eliminar.
     **/
    public void EliminarCurso(Long cursoId) {
        CursoModel curso = cursoRepository.findById(cursoId).orElse(null);
        if (curso != null) {
            curso.setTeacher(null); // Desasociar curso del profesor
            cursoRepository.save(curso);
        }
    }

}