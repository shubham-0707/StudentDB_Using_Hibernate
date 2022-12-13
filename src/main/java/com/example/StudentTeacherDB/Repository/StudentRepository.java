package com.example.StudentTeacherDB.Repository;

import com.example.StudentTeacherDB.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer>{
}
