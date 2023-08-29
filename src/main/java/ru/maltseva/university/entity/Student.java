package ru.maltseva.university.entity;

public class Student implements CommonInterface, StudentInterface {
    private String firstName;
    private String lastName;
    private int age;
    private String thesis;
    private Teacher scientificAdviser;
    private University studyPlace;

    public Student(String firstName, String lastName, int age, String thesis) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.thesis = thesis;
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

    public String getThesis() {
        return thesis;
    }

    public void setThesis(String thesis) {
        this.thesis = thesis;
    }

    public Teacher getScientificAdviser() {
        return scientificAdviser;
    }

    public void setScientificAdviser(Teacher scientificAdviser) {
        this.scientificAdviser = scientificAdviser;
    }

    public University getStudyPlace() {
        return studyPlace;
    }

    public void setStudyPlace(University studyPlace) {
        this.studyPlace = studyPlace;
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
        System.out.println(firstName + " " + lastName + " выступает на конференции с докладом в " + getStudyPlace().getName());
    }

    @Override
    public void visitLessons() {
        System.out.println(firstName + " " + lastName + " посещает занятия");
    }

    @Override
    public void doTasks() {
        System.out.println(firstName + " " + lastName + " выполняет задания");
    }

    @Override
    public void writeThesis() {
        System.out.println(firstName + " " + lastName + " пишет дипломную работу у профессора " + getScientificAdviser().getFirstName() + " " + getScientificAdviser().getLastName());
    }

    @Override
    public void completeEducation() {
        System.out.println(firstName + " " + lastName + " выпускается из университета " + getStudyPlace().getName());
    }
}