package com.in.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in.entity.Faculty;
import com.in.repository.FacultyRepository;

@Service
public class FacultyServiceImpl implements FacultyService{
	@Autowired
	FacultyRepository facultyRepository;
	@Override
	public Faculty regiser(Faculty faculty) {
		return facultyRepository.save(faculty);
	}
	@Override
	public String login(int facultyId,String facultyPassword) {
		Optional<Faculty> faculty=facultyRepository.findByFacultyIdAndFacultyPassword(facultyId, facultyPassword);
		if(faculty.isPresent()) {
			return "logged in as faculty";
		}
		else {
			return "details not found";
		}
	}
	@Override
	public List<Faculty> getAllFaculty() {
		return facultyRepository.findAll();
	}
	@Override
	public Optional<Faculty> findById(int id) {
		return facultyRepository.findById(id);
	}
	@Override
	public Optional<Faculty> findByFacultyEmail(String facultyEmail){
		return facultyRepository.findByFacultyEmail(facultyEmail);
	}
	@Override
	public Optional<Faculty> findByPhoneNumber(long phoneNumber){
		return facultyRepository.findByPhoneNumber(phoneNumber);
	}
}
