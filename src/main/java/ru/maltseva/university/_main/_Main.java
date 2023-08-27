package ru.maltseva.university._main;

import ru.maltseva.university.entity.Student;
import ru.maltseva.university.entity.Teacher;
import ru.maltseva.university.entity.University;
import ru.maltseva.university.service.StudentRunnerService;
import ru.maltseva.university.service.TeacherRunnerService;

public class _Main {
    public static void main(String[] args) {
        Student student1 = new Student("Иван", "Иванов", 20, "Research in German Linguistics");
        Teacher teacher1 = new Teacher("Анна", "Петрова", 35, "Phraseology");
        Student student2 = new Student("Пётр", "Сидоров", 19, "Research in Literature");
        Teacher teacher2 = new Teacher("Мария", "Фёдорова", 37, "Thomas Mann's works");
        University university = new University("ГУ");
        student1.setScientificAdviser(teacher1);
        teacher1.setStudent(student1);
        student2.setScientificAdviser(teacher2);
        teacher2.setStudent(student2);
        student1.setStudyPlace(university);
        student2.setStudyPlace(university);
        teacher1.setWorkPlace(university);
        teacher2.setWorkPlace(university);
        StudentRunnerService.runStudentCommonAction(student1);
        StudentRunnerService.runStudentAction(student1);
        TeacherRunnerService.runTeacherCommonAction(teacher1);
        TeacherRunnerService.runTeacherAction(teacher1);
        StudentRunnerService.runStudentCommonAction(student2);
        StudentRunnerService.runStudentAction(student2);
        TeacherRunnerService.runTeacherCommonAction(teacher2);
        TeacherRunnerService.runTeacherAction(teacher2);
    }
}