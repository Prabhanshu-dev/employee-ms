package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl  implements EmployeeService {

	
	 	@Autowired
	    private EmployeeRepository employeeRepository;

	 	/*public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
			this.employeeRepository = employeeRepository;
		}*/

		@Override
	    public List < Employee > getAllEmployees() {
	        return employeeRepository.findAll();
	    }

	    @Override
	    public void saveEmployee(Employee employee) {
	        this.employeeRepository.save(employee);
	    }

	    @Override
	    public Employee getEmployeeById(long id) {
	        Optional < Employee > op = employeeRepository.findById(id);
	        Employee employee = null;
	        if (op.isPresent()) {
	            employee = op.get();
	        } else {
	            throw new RuntimeException(" Employee not found for id :: " + id);
	        }
	        return employee;
	    }

	    @Override
	    public void deleteEmployeeById(long id) {
	        this.employeeRepository.deleteById(id);

}
}

