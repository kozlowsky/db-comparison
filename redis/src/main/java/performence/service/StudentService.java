package performence.service;

import performence.entity.Student;

import java.util.List;

public interface StudentService {

    void save(Student student);

    List<Student> findAll();

    void deleteAll();

    long count();
}
