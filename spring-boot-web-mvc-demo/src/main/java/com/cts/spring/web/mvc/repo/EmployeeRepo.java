package com.cts.spring.web.mvc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.spring.web.mvc.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

}
