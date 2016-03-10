package employee.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import employee.domain.Employee;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

@RestController
public class EmployeeController {

    @RequestMapping("/")
    public List<Employee> index() {
        return getEmployees();
    }

    @RequestMapping("/projects/{id}")
    public List<Employee> getEmployeesByProjectId(@PathVariable String id) {
        List<Employee> result = new ArrayList<Employee>();

        List<Employee> employees = getEmployees();

        for (Employee emp : employees) {
            if (emp.getProjects().contains(id)) {
                result.add(emp);
            }
        }

        return result;
    }

    private List<Employee> getEmployees() {
    	Employee e1 = new Employee("1", "Eze", "Buenos Aires", Arrays.asList("1", "3"));
    	Employee e2 = new Employee("2", "Ema", "Bariloche", Arrays.asList("1"));
    	Employee e3 = new Employee("3", "Seba", "Buenos Aires", Arrays.asList("1", "2"));

    	List<Employee> employees = new ArrayList<Employee>();
    	employees.add(e1);
    	employees.add(e2);
    	employees.add(e3);

    	return employees;
    }
}