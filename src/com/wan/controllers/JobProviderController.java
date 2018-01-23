package com.wan.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wan.Dao.JobProviderDao;
import com.wan.beans.JobProvider;

@Controller
public class JobProviderController
{
	@Autowired
	JobProviderDao Jp;
	
	@RequestMapping(value="/JobProviderReg",method=RequestMethod.POST)
	public ModelAndView JobProviderReg(@ModelAttribute("JobProvider") JobProvider jp)
	{
		Jp.saveJobProvider(jp);
		
		return new ModelAndView ("/JobProviderLogin","command",new JobProvider());
	}
	
	@RequestMapping("jobprovider")
	public ModelAndView JobProvider()
	{
	
		return new ModelAndView ("/JobProviderReg","command",new JobProvider());
	}
	

	
}
