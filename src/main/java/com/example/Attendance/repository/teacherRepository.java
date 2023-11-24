package com.example.Attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Attendance.model.Teacher;


@Repository
public interface teacherRepository extends JpaRepository<Teacher, Long> {

}
