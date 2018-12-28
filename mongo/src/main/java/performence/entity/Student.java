package performence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    private Long id;

    private String name;

    private String surname;

    private int age;

    private Course course;
}
