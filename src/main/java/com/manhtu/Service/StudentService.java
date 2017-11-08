package com.manhtu.Service;

import com.manhtu.Dao.StudentDao;
import com.manhtu.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class StudentService {

    @Autowired
    @Qualifier("mock")
    private StudentDao studentDao;

    public Collection<Student> getAllStudent() {
        return studentDao.getAllStudent();
    }

    public Student getStudentById(int id) {
        return studentDao.getStudentById(id);
    }

    public void removeStudentById(int id) {
        studentDao.removeStudentById(id);
    }

    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }

    public void insertStudent(Student student) {
        studentDao.insertStudent(student);
    }
}
