package com.example.demo.repository;
import org.framework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Stuentity;

@Repository
public interface StuRepository extends JpaRepository<Stuentity,Long>{

}