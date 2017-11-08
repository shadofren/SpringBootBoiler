package com.manhtu.Dao;

import com.manhtu.Entity.Student;

import java.util.Collection;

public interface StudentDao {
    Collection<Student> getAllStudent();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertStudent(Student student);
}
