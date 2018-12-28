package performence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import performence.entity.Course;
import performence.entity.SampleEntity;

@Repository
public interface CourseRepository extends MongoRepository<Course, Long> {
}
