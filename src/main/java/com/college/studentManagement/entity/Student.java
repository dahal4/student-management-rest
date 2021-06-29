package com.college.studentManagement.entity;

import javax.persistence.*;

@Entity
@Table(name = "student_table")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String faculty;
    private Long rollNo;
    private Long fee;

    public Student() {
    }

    public Student(Long id, String name, String faculty, Long rollNo, Long fee) {
        this.id = id;
        this.name = name;
        this.faculty = faculty;
        this.rollNo = rollNo;
        this.fee = fee;
    }

    public Student(String name, String faculty, Long rollNo, Long fee) {
        this.name = name;
        this.faculty = faculty;
        this.rollNo = rollNo;
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", faculty='" + faculty + '\'' +
                ", rollNo=" + rollNo +
                ", fee=" + fee +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Long getRollNo() {
        return rollNo;
    }

    public void setRollNo(Long rollNo) {
        this.rollNo = rollNo;
    }

    public Long getFee() {
        return fee;
    }

    public void setFee(Long fee) {
        this.fee = fee;
    }
}
