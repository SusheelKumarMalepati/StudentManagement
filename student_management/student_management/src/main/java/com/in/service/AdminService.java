package com.in.service;

import org.springframework.stereotype.Component;

import com.in.entity.Admin;

@Component
public interface AdminService {
	public Admin register(Admin admin);
	public String login(int adminId,String adminPassword);
}
