package com.in.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.in.entity.Student;

@Component
public interface StudentService {
	public Student register(Student student);
	public String login(int studentId,String studentPassword);
	public List<Student> getAllStudent();
	public Optional<Student> findById(int id);
	public Optional<Student> findByStudentEmail(String studentEmail);
	public Optional<Student> findByPhoneNumber(long phoneNumber);
}
