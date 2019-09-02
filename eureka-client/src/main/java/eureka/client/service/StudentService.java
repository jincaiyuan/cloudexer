package eureka.client.service;

import com.walker.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();
    Student findById(long id);

    boolean save(Student student);
}
