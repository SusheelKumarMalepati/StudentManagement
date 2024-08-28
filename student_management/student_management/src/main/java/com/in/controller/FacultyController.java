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

import com.in.entity.Faculty;
import com.in.service.FacultyService;

@Controller
@RequestMapping(value="faculty")
public class FacultyController {
	@Autowired
	FacultyService facultyService;
	@PostMapping("/register")
	public ResponseEntity<Faculty> register(@RequestBody Faculty faculty){
		Faculty fac=facultyService.regiser(faculty);
		return new ResponseEntity<>(fac,HttpStatus.CREATED);
	}
	@GetMapping("/login/{facultyId}/{facultyPassword}")
	public ResponseEntity<String> login(@PathVariable int facultyId,@PathVariable String facultyPassword){
		String info=facultyService.login(facultyId, facultyPassword);
		return new ResponseEntity<>(info,HttpStatus.OK);
	}
	@GetMapping("/getall")
	public ResponseEntity<List<Faculty>> getAllFaculty(){
		List<Faculty> fac=facultyService.getAllFaculty();
		return new ResponseEntity<>(fac,HttpStatus.OK);
	}
	@GetMapping("/get/id/{id}")
	public ResponseEntity<Faculty> findById(@PathVariable int id){
		Optional<Faculty> fac = facultyService.findById(id);
		if (fac.isPresent()) {
			return new ResponseEntity<>(fac.get(), HttpStatus.FOUND);
		} 
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@GetMapping("/get/email/{facultyEmail}")
	public ResponseEntity<Optional<Faculty>> findByFacultyEmail(@PathVariable String facultyEmail){
		Optional<Faculty> fac=facultyService.findByFacultyEmail(facultyEmail);
		return new ResponseEntity<>(fac,HttpStatus.FOUND);
	}
	@GetMapping("/get/{phoneNumber}")
	public ResponseEntity<Optional<Faculty>> findByPhoneNumber(@PathVariable long phoneNumber){
		Optional<Faculty> fac=facultyService.findByPhoneNumber(phoneNumber);
		return new ResponseEntity<>(fac,HttpStatus.FOUND);
	}
}
