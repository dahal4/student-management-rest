package com.college.studentManagement.service;

import com.college.studentManagement.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentServiceInterface {
     List<Student> getStudents();
     Optional<Student> getById(Long id);
    void register(Student student);
    void deleteStudent(Long id);
    void updateStudent(Student student,Long id);
}
