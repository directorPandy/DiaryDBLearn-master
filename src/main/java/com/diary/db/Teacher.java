package com.diary.db;

import java.sql.SQLException;

public class Teacher {

    int id;
    String name;
    String spec;

    Teacher(String name, String spec) {
        this.name = name;
        this.spec = spec;
    }
}
