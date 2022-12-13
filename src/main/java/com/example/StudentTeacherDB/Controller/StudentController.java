package com.example.StudentTeacherDB.Controller;

import com.example.StudentTeacherDB.Model.Student;
import com.example.StudentTeacherDB.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/get_students")
    public ResponseEntity<List<Student>> getStudents(){
        return new ResponseEntity<>(studentService.getAllStudents() , HttpStatus.ACCEPTED);
    }

    @PostMapping("/add_students")
    public ResponseEntity<String> addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return new ResponseEntity<>("Student is added successfully" , HttpStatus.ACCEPTED);
    }


}
