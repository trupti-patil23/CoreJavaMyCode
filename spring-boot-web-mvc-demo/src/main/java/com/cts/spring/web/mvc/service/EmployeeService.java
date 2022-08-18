package com.cts.spring.web.mvc.service;

import java.util.List;
import com.cts.spring.web.mvc.entity.Employee;

public interface EmployeeService {
	
	List<Employee> getAll();
	
	Employee getById(Integer id);
	
	Employee add(Employee emp);
	
	void remove(Integer empId);

}
