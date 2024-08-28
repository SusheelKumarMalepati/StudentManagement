package com.in.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in.entity.Student;
import com.in.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentRepository studentRepository;
	@Override
	public Student register(Student student) {
		return studentRepository.save(student);
	}
	@Override
	public String login(int studentId,String studentPassword) {
		Optional<Student> stu=studentRepository.findByStudentIdAndStudentPassword(studentId, studentPassword);
		if(stu.isPresent()) {
			return "logged in as student";
		}
		else {
			return "details not found";
		}
	}
	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}
	@Override
	public Optional<Student> findById(int id) {
		return studentRepository.findById(id);
	}
	@Override
	public Optional<Student> findByStudentEmail(String studentEmail){
		return studentRepository.findByStudentEmail(studentEmail);
	}
	@Override
	public Optional<Student> findByPhoneNumber(long phoneNumber){
		return studentRepository.findByPhoneNumber(phoneNumber);
	}
}
