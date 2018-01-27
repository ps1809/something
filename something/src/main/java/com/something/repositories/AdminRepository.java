package com.something.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.something.beans.Admin;

public interface AdminRepository extends JpaRepository<Admin, Serializable>{

}
