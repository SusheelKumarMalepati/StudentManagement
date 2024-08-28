package com.in.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	public Optional<Student> findByStudentIdAndStudentPassword(int studentId,String studentPassword);
	public Optional<Student> findByStudentEmail(String studentEmail);
	public Optional<Student> findByPhoneNumber(long phoneNumber);
}
