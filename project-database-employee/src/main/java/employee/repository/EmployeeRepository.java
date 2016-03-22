package employee.repository;

import employee.domain.Employee;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
	
    public Employee findByName(String firstName);

}