package com.walker.controller;

import com.walker.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/provider")
public class ProviderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public List<Student> findAll() {
        return restTemplate.getForEntity("http://provider/student/findAll",List.class).getBody();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id) {
        return restTemplate.getForEntity("http://provider/student/findById/{id}",Student.class,id).getBody();
    }

    @PostMapping("/save")
    public boolean save(@RequestBody Student student) {
        return restTemplate.postForEntity("http://provider/student/save",student,Boolean.class).getBody();
    }

}
