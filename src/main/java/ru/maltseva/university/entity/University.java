package ru.maltseva.university.entity;

public class University {
    private String name;
    private Teacher employee;
    private Student student;

    public University(String name) {
        this.name = name;
    }

    public Teacher getEmployee() {
        return employee;
    }

    public void setEmployee(Teacher employee) {
        this.employee = employee;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}