package performence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import performence.entity.Course;

@Repository
public interface CourseRepository extends MongoRepository<Course, Long> {
}
