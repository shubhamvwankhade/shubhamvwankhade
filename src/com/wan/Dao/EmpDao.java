package com.wan.Dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.wan.beans.Emp;

public class EmpDao
{
	JdbcTemplate template;
	public void setTemplate(JdbcTemplate template) 
	{  
		this.template = template;   
	}
	
	public int save(Emp e)
	{
		System.out.println(e.getId()+e.getName()+e.getSalary()+e.getDesignation());
		
		String sql= "insert into emp(id,name,salary,designation) values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"','"+e.getDesignation()+"')";
		return template.update(sql) ;
	}
	
}
