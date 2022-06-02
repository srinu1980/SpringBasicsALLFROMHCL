package com.hcl.springjdbc2;

import java.util.*;
import javax.sql.DataSource;

public interface StudentDAO {
	
 
	public void setDataSource(DataSource ds);
    public void create(int id,String name, Integer age);
    public Student getStudent(Integer id);
    public List<Student> listStudents();
    public void delete(Integer id);
    
    public void update(Integer id, Integer age);
    	//update Student set age=? where id=2;
}
