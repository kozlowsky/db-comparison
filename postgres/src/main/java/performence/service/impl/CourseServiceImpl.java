package performence.service.impl;

import org.springframework.stereotype.Service;
import performence.entity.Course;
import performence.repository.CourseRepository;
import performence.service.CourseService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Resource
    private CourseRepository courseRepository;

    @Override
    public void save(Course course) {
        courseRepository.save(course);
    }

    @Override
    public List<Course> findAll() {
        List<Course> courses = new ArrayList<>();
        courseRepository.findAll().forEach(courses::add);
        return courses;
    }

    @Override
    public void deleteAll() {
        courseRepository.deleteAll();
    }
}
