package employee.bootstrap;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.InitializingBean;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import employee.domain.Employee;
import employee.repository.EmployeeRepository;


@Service
public class BootstrapDataPopulator implements InitializingBean {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
 	public void afterPropertiesSet() throws Exception {
 		generateDummyEmployees();
    }

    private void generateDummyEmployees() {
    	Employee e1 = new Employee("1", "Eze", "Buenos Aires", Arrays.asList("1", "3"));
    	Employee e2 = new Employee("2", "Ema", "Bariloche", Arrays.asList("1"));
    	Employee e3 = new Employee("3", "Seba", "Buenos Aires", Arrays.asList("1", "2"));

    	List<Employee> employees = new ArrayList<Employee>();
    	employees.add(e1);
    	employees.add(e2);
    	employees.add(e3);

    	for (Employee emp : employees) {
    		employeeRepository.save(emp);
    	}
    }
	
}