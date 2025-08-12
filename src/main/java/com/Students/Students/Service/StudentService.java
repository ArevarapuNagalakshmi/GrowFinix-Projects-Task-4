package com.Students.Students.Service;

import com.Students.Students.Dto.StudentDto;
import com.Students.Students.Entity.StudentEntity;
import com.Students.Students.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public StudentDto saveStudent(StudentDto studentDto){
        StudentEntity studentEntity=new StudentEntity(
                studentDto.getId(),
                studentDto.getName(),
                studentDto.getBranch(),
                studentDto.getMarks());
        StudentEntity studentEntity1=studentRepo.save(studentEntity);
        StudentDto studentDto1=new StudentDto(
                studentEntity1.getId(),
                studentEntity1.getName(),
                studentEntity1.getBranch(),
                studentEntity1.getMarks()
        );

        return studentDto1;
    }


    public StudentDto getStudent(Long id){
        StudentEntity studentEntity=studentRepo.findByid(id);
        StudentDto studentDto=new StudentDto(
                studentEntity.getId(),
                studentEntity.getName(),
                studentEntity.getBranch(),
                studentEntity.getMarks()
        );

        return studentDto;
    }


    public StudentDto updateStudent(Long id,StudentDto studentDto){
        StudentEntity studentEntity=studentRepo.findByid(id);
              studentEntity.setName(studentDto.getName());
              studentEntity.setBranch(studentDto.getBranch());
              studentEntity.setMarks(studentDto.getMarks());
              StudentEntity studentEntity1=studentRepo.save(studentEntity);
              StudentDto studentDto1=new StudentDto(
                      studentEntity1.getId(),
                      studentEntity1.getName(),
                      studentEntity1.getBranch(),
                      studentEntity1.getMarks()
              );


        return studentDto1;
    }

    public StudentEntity deleteStudent(Long id){
        StudentEntity studentEntity=studentRepo.findByid(id);
         studentRepo.deleteById(id);
         return studentEntity;
    }
}
