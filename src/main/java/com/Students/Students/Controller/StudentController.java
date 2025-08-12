package com.Students.Students.Controller;

import com.Students.Students.Dto.StudentDto;
import com.Students.Students.Entity.StudentEntity;
import com.Students.Students.Service.StudentService;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/savestudent")
    public ResponseEntity<StudentDto>saveStudent(@RequestBody StudentDto studentDto){
        StudentDto studentDto1=studentService.saveStudent(studentDto);
        return new ResponseEntity<>(studentDto1, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDto>getStudent(@PathVariable Long id){
        StudentDto studentDto=studentService.getStudent(id);
        return new ResponseEntity<>(studentDto,HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<StudentDto>updateStudent(@PathVariable Long id,
                                                   @RequestBody StudentDto studentDto){
        StudentDto studentDto1=studentService.updateStudent(id,studentDto);
        return new ResponseEntity<>(studentDto1,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<StudentEntity>deleteStudent(@PathVariable Long id){
        StudentEntity studentEntity=studentService.deleteStudent(id);
        return new ResponseEntity<>(studentEntity,HttpStatus.OK);
    }
}
