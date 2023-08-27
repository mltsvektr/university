package ru.maltseva.university.service;

import ru.maltseva.university.util.CommonInterface;
import ru.maltseva.university.util.StudentInterface;

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