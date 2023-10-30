package _09_mvc.service;

import _09_mvc.model.Student;
import _09_mvc.repository.StudentRepository;
import _09_mvc.repository.StudentRepositoryImpl;

public class StudentServiceImpl implements StudentService{

    private StudentRepository repository = new StudentRepositoryImpl();

    @Override
    public Student[] findAll() {
        return repository.findAll();
    }

    @Override
    public void addStudent(Student student) {
        repository.addStudent(student);
    }
}
