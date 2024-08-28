package com.in.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in.entity.Faculty;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Integer>{
	public Optional<Faculty> findByFacultyIdAndFacultyPassword(int facultyId,String facultyPassword);
	public Optional<Faculty> findByFacultyEmail(String facultyEmail);
	public Optional<Faculty> findByPhoneNumber(long phoneNumber);
}
