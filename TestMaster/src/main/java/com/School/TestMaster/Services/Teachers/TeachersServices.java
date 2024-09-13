package com.School.TestMaster.Services.Teachers;

import com.School.TestMaster.Model.Teachers.TeachersModel;
import com.School.TestMaster.Repository.Teachers.TeachersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TeachersServices {

    @Autowired
    private TeachersRepository teachersRepository;

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
    }}

    /**
     * Guarda un profesor.
    *
    * @param Nota30 esta es la nota del 30% del estudiante.
    *
    * @param Nota70 esta es la nota del 70% del estudiante.
    *
    * @return El promedio de la nota final.
    **/
    public Double PromedioDelEstudiante(Double Nota30, Double Nota70){
        return Double.parseDouble((Nota30*0.3)+(Nota70*0.7));
    }

}