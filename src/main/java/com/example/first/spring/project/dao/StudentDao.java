package com.example.first.spring.project.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.first.spring.project.entity.Student;

@Repository
public interface StudentDao extends CrudRepository<Student,Integer>{

}
