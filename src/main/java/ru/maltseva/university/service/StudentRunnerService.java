package ru.maltseva.university.service;

import ru.maltseva.university.entity.CommonInterface;
import ru.maltseva.university.entity.StudentInterface;

public class StudentRunnerService {
    public static void runStudentCommonAction(CommonInterface commonInterface) {
        commonInterface.drinkCoffee();
        commonInterface.visitLibrary();
        commonInterface.writeArticle();
        commonInterface.speakAtConference();
    }

    public static void runStudentAction(StudentInterface studentInterface) {
        studentInterface.visitLessons();
        studentInterface.doTasks();
        studentInterface.writeThesis();
        studentInterface.completeEducation();
    }
}