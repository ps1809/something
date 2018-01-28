package com.something.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.something.beans.Admin;
import com.something.service.AdminService;
import com.something.serviceimpl.AdminServiceImpl;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService service;

	@RequestMapping(value="/login",method=RequestMethod.POST,produces="application/json")
	public String doLogin(@RequestBody Admin admin){
		return service.doLogin(admin);
	}
	
	@GetMapping("/ping")
	public String pingCheck(){
		return "working";
	}
}
