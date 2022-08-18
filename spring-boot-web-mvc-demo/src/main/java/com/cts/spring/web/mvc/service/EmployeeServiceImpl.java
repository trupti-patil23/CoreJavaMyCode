package com.cts.spring.web.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.spring.web.mvc.entity.Employee;
import com.cts.spring.web.mvc.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepo empRepo;

	@Override
	public List<Employee> getAll() {
		return empRepo.findAll();
	}

	@Override
	public Employee getById(Integer id) {
		return empRepo.findById(id).orElse(null);
	}

	@Override
	public Employee add(Employee emp) {
		return empRepo.save(emp);
	}

	@Override
	public void remove(Integer empId) {
		empRepo.deleteById(empId);
	}

}
