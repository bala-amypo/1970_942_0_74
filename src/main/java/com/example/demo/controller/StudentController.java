package com.example.demo.controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
@RestController
public StudentController{
@Autowired
StudentService studentService;
@PostMapping("/postdata")
public Stuentity postdata(@RequestBody Stuentity student){
    return studentService.saveStudet(student);
}
}