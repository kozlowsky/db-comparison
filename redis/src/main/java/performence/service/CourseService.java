package performence.service;

import performence.entity.Course;

import java.util.List;

public interface CourseService {

    void save(Course course);

    List<Course> findAll();

    void deleteAll();
}
