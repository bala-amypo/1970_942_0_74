package com.expalme.demo.controller;
@RestController
public StudentController{
@Autowired
StudentService studentService;
@PostMapping("/postdata")
public Stuentity postdata(@RequestBody Stuentity student){
    return studentService.saveStudet(student);
}
}