package com.example.Attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Attendance.model.Grade;


@Repository
public interface gradeRepository extends JpaRepository<Grade, Long> {

}
