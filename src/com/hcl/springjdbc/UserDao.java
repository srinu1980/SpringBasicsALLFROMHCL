package com.hcl.springjdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao 
{
	private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int SaveUser(User u)
	{
		String query="insert into UserTable values('"+u.getId()+"','"+u.getName()+"','"+u.getSalary()+"')";
		
		return jdbcTemplate.update(query);
	}
	
	public int deleteUser(User u)
	{
		String query="delete from UserTable where id='"+u.getId()+"' ";
		
		return jdbcTemplate.update(query);
	}
	
	
	public int updateUser(User u)
	{
		String query="update  UserTable  set name='"+u.getName()+"', salary='"+u.getSalary()+"' where id='"+u.getId()+"' ";
		
		return jdbcTemplate.update(query);
	}
	
	
}
