package com.something.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.something.beans.Admin;
import com.something.dao.AdminDao;
import com.something.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminDao dao;
	
	public String doLogin(Admin admin) {
		
		return dao.doLogin(admin);
	}

}
