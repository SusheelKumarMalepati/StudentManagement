package com.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.in.entity.Admin;
import com.in.service.AdminService;

@Controller
@RequestMapping(value="admin")
public class AdminController {
	@Autowired
	AdminService adminService;
	@PostMapping("/register")
	public ResponseEntity<Admin> register(@RequestBody Admin admin) {
		Admin a=adminService.register(admin);
		return new ResponseEntity<Admin>(a, HttpStatus.CREATED);
	}
	@GetMapping("/login/{adminId}/{adminPassword}")
	public ResponseEntity<String> login(@PathVariable int adminId,@PathVariable String adminPassword) {
		String ad=adminService.login(adminId, adminPassword);
		return new ResponseEntity<String>(ad,HttpStatus.OK);
	}
}
