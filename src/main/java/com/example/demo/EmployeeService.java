package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
	
	List < Employee > getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);

}
