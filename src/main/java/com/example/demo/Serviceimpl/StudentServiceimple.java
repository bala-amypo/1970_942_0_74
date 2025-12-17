package com.example.demo.Serviceimpl;
import com.example.demo.service.stereotype.Service;
import com.example.demo.service.StudentService;
import com.example.demo.repository.StuRepository;
import com.example.demo.entity;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class StudentServiceimple implements StudentService{

//  private final StuRepository studentrepository;
//  public StudentServiceimple(StuRepository studentrepository){
//     this.studentrepository=studentrepository;
//  }
 @Autowired
 StuRepository studentrepository;

public Stuentity saveStudent(Stuentity student){
return studentrepository.save(student);
}
}
