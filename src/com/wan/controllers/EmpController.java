package com.wan.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import com.wan.Dao.EmpDao;
import com.wan.beans.Emp;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class EmpController 
{
	@Autowired
	EmpDao dao;


@RequestMapping("emplogin")	
public ModelAndView showlogin()
{
	return new ModelAndView("/EmpLogin","command",new Emp());
}

@RequestMapping("empregister")
public ModelAndView showregister()
{
	return new ModelAndView("/EmpRegister","command",new Emp());
}

@RequestMapping(value="/saveemp",method=RequestMethod.POST)
public ModelAndView saveemp(@ModelAttribute("Emp") Emp emp)
{
	dao.save(emp);
	return new ModelAndView("redirect:/EmpLogin");
}


}
