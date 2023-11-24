package com.example.Attendance.repository;

import org.springframework.stereotype.Repository;
import com.example.Attendance.model.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface attendanceRepository extends JpaRepository<Attendance, Long> {

}
