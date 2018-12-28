package performence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import performence.entity.Student;

public interface StudentRepository extends MongoRepository<Student, Long> {
}
