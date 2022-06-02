package com.hcl.springjdbc2;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO 
{

	private DataSource dataSource;
	   private JdbcTemplate jdbcTemplateObject;
	
	public void setDataSource(DataSource ds) {

	      this.dataSource = dataSource;
	      this.jdbcTemplateObject = new JdbcTemplate(dataSource);

		
	}

		   public void create(int id,String name, Integer age) {
			      String SQL = "insert into Student (id,name, age) values (?,?, ?)";
			      jdbcTemplateObject.update( SQL,id, name, age);
			      System.out.println("Created Record Name = " + name + " Age = " + age);
		
	}
		   						//2
	public Student getStudent(Integer id) {
	      String SQL = "select * from Student where id = ?";
	      Student student = jdbcTemplateObject.queryForObject(SQL, 
	         new Object[]{id}, new StudentMapper());
	      
	      return student;
	}
	
	public List<Student> listStudents() {
	      String SQL = "select * from Student";
	      List <Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
	      return students;
	}
	
	public void delete(Integer id) {
		// TODO Auto-generated method stub
	      String SQL = "delete from Student where id = ?";
	      jdbcTemplateObject.update(SQL, id);
	      System.out.println("Deleted Record with ID = " + id );
	 	
	}
	
	public void update(Integer id, Integer age) {
		// TODO Auto-generated method stub
	      String SQL = "update Student set age = ? where id = ?";
	      jdbcTemplateObject.update(SQL, age, id);
	      System.out.println("Updated Record with ID = " + id );
	 	
	}
	   
	
}
