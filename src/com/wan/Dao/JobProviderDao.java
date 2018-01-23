package com.wan.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.wan.beans.Emp;
import com.wan.beans.JobProvider;

public class JobProviderDao
{
	JdbcTemplate template;
	public void setTemplate(JdbcTemplate template) 
	{  
		this.template = template;   
	}
	
	public int saveJobProvider(JobProvider jp)
	{
		String sql= "insert into jobprovider(contactNo,jobName,location) values('"+jp.getContactNo()+"','"+jp.getJobName()+"','"+jp.getLocation()+"')";
		return template.update(sql) ;
	}
	
	public JobProvider checkJobProvider(JobProvider jp)
	{
		String sql="select * from jobprovider where contactNo='"+jp.getContactNo()+"' and jobName='"+jp.getJobName()+"'";
		
		List<JobProvider> jobprovider= template.query(sql,new JobProviderMapper());
		

		return jobprovider.size() > 0 ? jobprovider.get(0) : null;
		
	}
		

}
class JobProviderMapper implements RowMapper
{

	@Override
	public Object mapRow(ResultSet rs, int arg1) throws SQLException {
	
		JobProvider jp=new JobProvider();
		  
		
		jp.setContactNo(rs.getString("contactNo"));
		jp.setJobName(rs.getString("jobName"));
		jp.setLocation(rs.getString("location"));
		
	
		
		return jp;
	}
}
