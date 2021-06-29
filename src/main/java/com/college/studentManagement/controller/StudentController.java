package com.college.studentManagement.controller;

import com.college.studentManagement.entity.Student;
import com.college.studentManagement.service.StudentService;
import com.college.studentManagement.service.StudentServiceInterface;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1/student")

public class StudentController {
    private final StudentServiceInterface studentService;


    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping("/{id}")
    public Optional<Student> getById(@PathVariable Long id) {
        return studentService.getById(id);

    }

    @PostMapping
    public String registerStudent(@RequestBody Student student) {
        studentService.register(student);
        return "Congrats new user with name : ".toUpperCase() + student.getName() + " successfully added".toUpperCase();

    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable("id") Long id) {
        try {
            studentService.deleteStudent(id);
            return "deleted successfully".toUpperCase();
        } catch (Error e) {
            return "provided id not found".toUpperCase();
        }
    }

    @PutMapping("/{id}")
    public String updateStudent(@RequestBody Student student, @PathVariable("id") Long id) {
        try {
            studentService.updateStudent(student, id);
            return student.toString();
        } catch (Error e) {
            return "provided id not found or ".toUpperCase();
        }
    }

}
