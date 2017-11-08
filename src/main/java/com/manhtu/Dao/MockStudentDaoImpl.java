package com.manhtu.Dao;

import com.manhtu.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("mock")
public class MockStudentDaoImpl implements StudentDao {
    private static Map<Integer, Student> students;

    static {
        students = new HashMap<>() {
            {
                put(1, new Student(1, "One", "Computer Science"));
                put(2, new Student(2, "Two", "Computer Science"));
                put(3, new Student(3, "Three", "Computer Science"));
                put(4, new Student(4, "Four", "Computer Science"));
            }
        };
    }

    @Override
    public Collection<Student> getAllStudent() {
        return this.students.values();
    }

    @Override
    public Student getStudentById(int id) {
        return this.students.get(id);
    }

    @Override
    public void removeStudentById(int id) {
        this.students.remove(id);
    }

    @Override
    public void updateStudent(Student student) {
        Student s = students.get(student.getId());
        s.setCourse(student.getCourse());
        s.setName(student.getName());
    }

    @Override
    public void insertStudent(Student student) {
        students.put(student.getId(), student);
    }
}
