package com.in.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.in.entity.Student;
import com.in.entity.Student;
import com.in.service.StudentService;

@Controller
@RequestMapping(value="student")
public class StudentController {
	@Autowired
	StudentService studentService;
	@PostMapping("/register")
	public ResponseEntity<Student> register(@RequestBody Student student) {
		Student stu=studentService.register(student);
		return new ResponseEntity<>(stu,HttpStatus.CREATED);
	}
	@GetMapping("/login/{studentId}/{studentPassword}")
	public ResponseEntity<String> login(@PathVariable int studentId,@PathVariable String studentPassword) {
		String info=studentService.login(studentId, studentPassword);
		return new ResponseEntity<>(info,HttpStatus.OK);
	}
	@GetMapping("/getall")
	public ResponseEntity<List<Student>> getAllStudent(){
		List<Student> fac=studentService.getAllStudent();
		return new ResponseEntity<>(fac,HttpStatus.OK);
	}
	@GetMapping("/get/id/{id}")
	public ResponseEntity<Student> findById(@PathVariable int id){
		Optional<Student> fac = studentService.findById(id);
		if (fac.isPresent()) {
			return new ResponseEntity<>(fac.get(), HttpStatus.FOUND);
		} 
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@GetMapping("/get/email/{studentEmail}")
	public ResponseEntity<Optional<Student>> findByStudentEmail(@PathVariable String studentEmail){
		Optional<Student> fac=studentService.findByStudentEmail(studentEmail);
		return new ResponseEntity<>(fac,HttpStatus.FOUND);
	}
	@GetMapping("/get/{phoneNumber}")
	public ResponseEntity<Optional<Student>> findByPhoneNumber(@PathVariable long phoneNumber){
		Optional<Student> fac=studentService.findByPhoneNumber(phoneNumber);
		return new ResponseEntity<>(fac,HttpStatus.FOUND);
	}
}
