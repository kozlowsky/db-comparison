package performence.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import performence.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
}
