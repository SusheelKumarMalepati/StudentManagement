package com.in.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.in.entity.Faculty;

@Component
public interface FacultyService {
	public Faculty regiser(Faculty faculty);
	public String login(int facultyId,String facultyPassword);
	public List<Faculty> getAllFaculty();
	public Optional<Faculty> findById(int id);
	public Optional<Faculty> findByFacultyEmail(String facultyEmail);
	public Optional<Faculty> findByPhoneNumber(long phoneNumber);
}
