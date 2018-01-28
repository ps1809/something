package com.something.repositories;

import java.io.Serializable;

import javax.websocket.server.PathParam;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.something.beans.Admin;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Serializable>{

	@Query("select a from admin a where a.username=:key and a.password=:secret")
	public Admin doLogin(@PathParam("key") String key,@PathParam("secret") String secret);
}
