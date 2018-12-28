package performence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Reference;
import org.springframework.data.redis.core.RedisHash;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RedisHash("Student")
public class Student {

    @Id
    private Long id;

    private String name;

    private String surname;

    private int age;

    @Reference Course course;
}
