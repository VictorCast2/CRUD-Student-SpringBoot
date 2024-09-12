package com.School.TestMaster.Repository.Teachers;

import com.School.TestMaster.Model.Teachers.TeachersModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeachersRepository extends JpaRepository<TeachersModel, Long> {
}