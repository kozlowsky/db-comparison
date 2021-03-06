package performence;

import org.springframework.stereotype.Component;
import performence.entity.Course;
import performence.entity.Student;
import performence.service.CourseService;
import performence.service.StudentService;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;

@Component
public class PostgresRunner {
    @Resource
    private CourseService courseService;

    @Resource
    private StudentService studentService;

    @PostConstruct
    public void init() {
        deleteElements();

        long start = System.currentTimeMillis();

        insertElements();

        long testTime = System.currentTimeMillis() - start;

        System.out.println("TEST TIME: " + testTime + "ms");
    }

    private long countElements() {
        return studentService.count();
    }

    private void insertElements() {
        for (int i = 0; i < 100; i++) {
            Course course = new Course((long) i, "Math");
            courseService.save(course);
            for (int j = 0; j < 100; j++) {
                Student student = new Student((long) i * 100 + j, "student", "student", 1, course);
                studentService.save(student);
            }
        }
    }

    private List<Student> selectElements() {
        return studentService.findAll();
    }

    private void deleteElements() {
        studentService.deleteAll();
        courseService.deleteAll();
    }
}
