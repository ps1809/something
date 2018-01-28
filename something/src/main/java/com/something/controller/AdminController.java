package com.something.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.something.beans.Admin;

@RestController
@RequestMapping(value = "admin")
public class AdminController {

	@RequestMapping(value="/login",method=RequestMethod.GET,produces="application/json")
	public String doLogin(@RequestBody Admin admin){
		return null;
	}
}
