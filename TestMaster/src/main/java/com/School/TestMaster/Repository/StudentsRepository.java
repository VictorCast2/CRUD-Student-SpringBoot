package com.School.TestMaster.Repository;

import com.School.TestMaster.Model.Students.StudentsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepository extends JpaRepository<StudentsModel, Long> {
}