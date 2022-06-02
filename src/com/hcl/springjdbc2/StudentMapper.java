package com.hcl.springjdbc2;

import java.util.*;

import org.springframework.jdbc.core.RowMapper;

import java.sql.*;
public class StudentMapper implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		      Student student = new Student();
		      student.setId(rs.getInt("id"));
		      student.setName(rs.getString("name"));
		      student.setAge(rs.getInt("age"));
		      
		      return student;
	
	}
}
