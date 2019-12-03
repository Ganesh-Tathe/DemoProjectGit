package com.training.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.training.beans.MyUser;
@Repository
public class RegisterDaoImpl implements RegisterDao {
@Autowired
  JdbcTemplate jdbcTemplate;
	public int registerUser(MyUser u) {
	String sql="insert into registertable values(?,?,?,?,?,?,?,?,?)";
	return jdbcTemplate.update(sql,new Object[] {u.getFname(),u.getLname(),u.getBdate(),u.getGender(),u.getCountry(),u.getState(),u.getCity(),u.getEmail(),u.getPassword()});

	}
	
	
	
	

}
