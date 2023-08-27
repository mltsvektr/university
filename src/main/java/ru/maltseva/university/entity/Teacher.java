package ru.maltseva.university.entity;

import ru.maltseva.university.util.CommonInterface;
import ru.maltseva.university.util.TeacherInterface;

public class Teacher implements CommonInterface, TeacherInterface {
    private String firstName;
    private String lastName;
    private int age;
    private String fieldOfStudy;
    private Student student;
    private University workPlace;

    public Teacher(String firstName, String lastName, int age, String fieldOfStudy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName() {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName() {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public University getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(University workPlace) {
        this.workPlace = workPlace;
    }

    @Override
    public void drinkCoffee() {
        System.out.println(firstName + " " + lastName + " пьёт кофе");
    }

    @Override
    public void visitLibrary() {
        System.out.println(firstName + " " + lastName + " посещает библиотеку");
    }

    @Override
    public void writeArticle() {
        System.out.println(firstName + " " + lastName + " пишет статью");
    }

    @Override
    public void speakAtConference() {
        System.out.println(firstName + " " + lastName + " выступает с докладом на конференции в " + getWorkPlace().getName());
    }

    @Override
    public void holdLessons() {
        System.out.println(firstName + " " + lastName + " проводит занятие");
    }

    @Override
    public void correctTasks() {
        System.out.println(firstName + " " + lastName + " проверяет работы");
    }

    @Override
    public void assignGrade() {
        System.out.println(firstName + " " + lastName + " ставит оценку студенту " + getStudent().getFirstName() + " " + getStudent().getLastName());
    }

    @Override
    public void resign() {
        System.out.println(firstName + " " + lastName + " увольняется из университета " + getWorkPlace().getName());
    }
}