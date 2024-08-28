package com.in.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{
	public Optional<Admin> findByAdminIdAndAdminPassword(int adminId,String Password);
}
