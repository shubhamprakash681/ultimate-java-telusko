package in.shubhamprakash681.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.shubhamprakash681.models.Student;
import in.shubhamprakash681.repo.StudentRepository;

@Service
public class StudentService {
    private StudentRepository repository;

    public StudentRepository getRepository() {
        return repository;
    }

    @Autowired
    public void setRepository(StudentRepository repository) {
        this.repository = repository;
    }

    public void addStudent(Student student) {
        repository.save(student);
    }

    public List<Student> getStudents() {
        return repository.findAll();
    }
}
