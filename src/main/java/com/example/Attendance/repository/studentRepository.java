package com.example.Attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Attendance.model.Student;

@Repository
public interface studentRepository extends JpaRepository<Student, Long> {

}
