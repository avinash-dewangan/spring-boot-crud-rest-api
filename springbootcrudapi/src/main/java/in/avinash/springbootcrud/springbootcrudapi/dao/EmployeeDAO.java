package in.avinash.springbootcrud.springbootcrudapi.dao;

import java.util.List;

import in.avinash.springbootcrud.springbootcrudapi.model.Employee;

public interface EmployeeDAO {

	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);
}
