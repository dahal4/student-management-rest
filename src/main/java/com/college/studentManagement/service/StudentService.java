package com.college.studentManagement.service;

import com.college.studentManagement.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements StudentServiceInterface {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getById(Long id) {
        return studentRepository.findById(id);

    }

    public void register(Student student) {
        studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        if (studentRepository.findById(id).isPresent()) {
            studentRepository.deleteById(id);
        } else {
            throw new Error();
        }
    }

    public void updateStudent(Student student, Long id) {
        if (studentRepository.findById(id).isPresent()) {

                studentRepository.save(student);

        } else {
            throw new Error();
        }
    }
}
