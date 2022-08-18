package com.cts.spring.web.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cts.spring.web.mvc.entity.Employee;
import com.cts.spring.web.mvc.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/list")
	public ModelAndView listEmployeeAction() {
		return new ModelAndView("/list-page", "employeeList", empService.getAll());
	}
	

	@GetMapping("/add")
	public ModelAndView addAction() {
		return new ModelAndView("/employeeAdd", "emp", new Employee());
	}
	
	@GetMapping("/edit")
	public ModelAndView editAction(@ModelAttribute("empId")  Integer empId) {
		
		return new ModelAndView("/employeeAdd", "emp", empService.getById(empId));
	}
	
	@GetMapping("/delete")
	public ModelAndView deleteAction(@ModelAttribute("empId")  Integer empId) {
		empService.remove(empId);
		return new ModelAndView("/list-page", "employeeList", empService.getAll());
	}
	
	@PostMapping({"/add" , "/edit"})
	public ModelAndView saveEmployeeAction(@ModelAttribute("emp") Employee emp) {
		
		empService.add(emp);
		return new ModelAndView("/employeeAdd", "emp", new Employee());
		
		
		
	}

}
