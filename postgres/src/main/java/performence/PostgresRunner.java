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

    private int LENGTH = 100;

    @PostConstruct
    public void init() {
//        deleteElements();
        long startTime = System.currentTimeMillis();
//        insertElements();
        List<Student> elements =selectElements();

        long endTime = System.currentTimeMillis();
        long timeTotal = endTime - startTime;
        System.out.println(timeTotal + "ms time elapsed!");
        System.out.println(elements.size());
    }

    private long countElements() {
        return studentService.count();
    }

    private void insertElements() {
        for (int i = 0; i < 1; i++) {
            Course course = new Course((long) i, "Math");
            courseService.save(course);
            for (int j = 0; j < 1000; j++) {
                Student student = new Student((long) i * LENGTH + j, "student", "student", 1, course);
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
