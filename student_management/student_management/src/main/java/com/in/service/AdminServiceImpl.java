package com.in.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in.entity.Admin;
import com.in.repository.AdminRepository;
@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	AdminRepository adminRepository;
	@Override
	public Admin register(Admin admin) {
		Admin adm=adminRepository.save(admin);
		return adm;
	}
	public String login(int adminId,String adminPassword) {
		Optional<Admin> admin=adminRepository.findByAdminIdAndAdminPassword(adminId,adminPassword);
		if(admin.isPresent()) {
			return "Logged in successfully as admin";
		}
		else {
			return "details not found";
		}
	}
}
