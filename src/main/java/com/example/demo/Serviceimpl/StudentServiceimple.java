package com.example.demo.Serviceimpl;
import com.example.demo.service.stereotype.Service;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceimple implements StudentService{

 private final StuRepository studentrepository;
 public StudentServiceimple(StuRepository studentrepository){
    this.studentrepository=studentrepository;
 }
public Stuentity saveStudent(Stuentity student){
return studentrepository.save(student);
}
}
