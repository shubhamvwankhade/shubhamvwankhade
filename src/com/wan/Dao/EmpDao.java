package com.wan.Dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;  
import org.springframework.jdbc.core.BeanPropertyRowMapper;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;


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
		//System.out.println(e.getId()+e.getName()+e.getSalary()+e.getDesignation());
		
		String sql= "insert into emp(id,name,salary,designation) values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"','"+e.getDesignation()+"')";
		return template.update(sql) ;
	}
	
	public Emp checkemp(Emp e)
	{
		String sql="select * from emp where name='"+e.getName()+"' and designation='"+e.getDesignation()+"'";
		System.out.println(sql);
		
	
		
		List<Emp> emps= template.query(sql,new EmpMapper());
		
		System.out.println(emps.get(0));
		return emps.size() > 0 ? emps.get(0) : null;
		
	}
	

}

class EmpMapper implements RowMapper
{

	@Override
	public Object mapRow(ResultSet rs, int arg1) throws SQLException {
	
		Emp emps=new Emp();
		emps.setId(rs.getInt("id"));  
		emps.setName(rs.getString("name"));
		emps.setSalary(rs.getFloat("salary"));
		emps.setDesignation(rs.getString("designation"));
		
	
		
		return emps;
	}
}

