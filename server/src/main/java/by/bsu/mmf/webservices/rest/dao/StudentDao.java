package by.bsu.mmf.webservices.rest.dao;

import by.bsu.mmf.webservices.rest.entity.Student;

import java.util.Collection;

public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertStudentToDb(Student student);
}
