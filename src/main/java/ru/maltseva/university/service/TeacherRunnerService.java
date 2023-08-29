package ru.maltseva.university.service;

import ru.maltseva.university.entity.CommonInterface;
import ru.maltseva.university.entity.TeacherInterface;

public class TeacherRunnerService {
    public static void runTeacherCommonAction(CommonInterface commonInterface) {
        commonInterface.drinkCoffee();
        commonInterface.visitLibrary();
        commonInterface.writeArticle();
        commonInterface.speakAtConference();
    }

    public static void runTeacherAction(TeacherInterface teacherInterface) {
        teacherInterface.holdLessons();
        teacherInterface.correctTasks();
        teacherInterface.assignGrade();
        teacherInterface.resign();
    }
}