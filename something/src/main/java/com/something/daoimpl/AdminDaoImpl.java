package com.something.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.something.beans.Admin;
import com.something.dao.AdminDao;
import com.something.repositories.AdminRepository;

@Service
public class AdminDaoImpl implements AdminDao{

	@Autowired
	AdminRepository adminrepo;
	
	public String doLogin(Admin admin) {
		Admin db=adminrepo.doLogin(admin.getAdminKey(), admin.getAdminSecret());
		if(db==null){
			return "Invalid credentials";
		}
		return "Success";
	}

}
