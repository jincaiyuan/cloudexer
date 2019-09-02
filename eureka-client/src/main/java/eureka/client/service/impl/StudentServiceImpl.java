package eureka.client.service.impl;

import com.walker.entity.Student;
import eureka.client.service.StudentService;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class StudentServiceImpl implements StudentService {

    private static Map<Long, Student> students = new HashMap<>();
     static {
        students.put(1l, new Student(1l,"张三",19));
         students.put(2l, new Student(2l,"李四",20));
         students.put(3l, new Student(3l,"王五",21));
     }

    @Override
    public List<Student> findAll() {
         List<Student> studentList = new ArrayList<>(3);
        students.values().forEach(s -> studentList.add(s));
        return studentList;
    }

    @Override
    public Student findById(long id) {
        return students.get(id);
    }

    @Override
    public boolean save(Student student) {
        students.put(student.getId(),student);
         return true;
    }
}
