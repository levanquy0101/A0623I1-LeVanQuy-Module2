package _09_mvc.repository;

import _09_mvc.model.Student;

public interface StudentRepository {
    Student[] findAll();

    void addStudent(Student student);
}
