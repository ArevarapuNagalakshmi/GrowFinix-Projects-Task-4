package com.Students.Students.Repository;

import com.Students.Students.Entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<StudentEntity,Long> {
    StudentEntity findByid(Long id);

}
