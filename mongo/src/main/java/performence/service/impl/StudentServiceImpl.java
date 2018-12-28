package performence.service.impl;

import org.springframework.stereotype.Service;
import performence.entity.Student;
import performence.repository.StudentRepository;
import performence.service.StudentService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentRepository studentRepository;

    public void save(Student student) {
        studentRepository.save(student);
    }

    public List<Student> findAll() {
        return new ArrayList<>(studentRepository.findAll());
    }

    @Override
    public void deleteAll() {
        studentRepository.deleteAll();
    }

    @Override
    public long count() {
        return studentRepository.count();
    }
}
