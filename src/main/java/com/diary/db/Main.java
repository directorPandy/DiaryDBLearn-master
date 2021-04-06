package com.diary.db;

import com.diary.db.Constructor;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

        Constructor constructor = new Constructor();
        Teacher teacher = new Teacher("Tolyan", "spec");
        teacher.id = (int) constructor.generateId();
        constructor.tableInsert(teacher.id, teacher.name,teacher.spec ,
                "INSERT INTO TEACHERS (id, name, specificity) Values (?, ?, ?)", "newTeacher");

        Student student = new Student("Sergo", "lohi");
        student.id = constructor.generateId();
        constructor.tableInsert((int) student.id, student.name,student.Class ,
                "INSERT INTO STUDENTS (id, name, class) Values (?, ?, ?)", "newStudent");

        Class klass = new Class("21af", "phisycs");
        klass.id = constructor.generateId();
        constructor.tableInsert((int) klass.id, klass.number, klass.spec,
                "INSERT INTO CLASS (id, number, specificity) Values (?, ?, ?)", "newClass");



        Harvester harvester = new Harvester();
        harvester.teachersHarvest();
        harvester.studentHarvest();
        harvester.classHarvest();


    }
}