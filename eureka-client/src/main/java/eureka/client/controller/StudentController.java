package eureka.client.controller;

import com.walker.entity.Student;
import eureka.client.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/findAll")
    public List<Student> findAll() {
        return service.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id) {
        return service.findById(id);
    }

    @PostMapping("/save")
    public boolean save(@RequestBody Student student) {
        return service.save(student);
    }
}
