package com.ltts.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.ltts.model.Student;




@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
