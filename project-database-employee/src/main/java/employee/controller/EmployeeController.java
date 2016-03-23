package employee.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import employee.domain.Employee;
import employee.repository.EmployeeRepository;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;



@RestController
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @RequestMapping("/")
    public List<Employee> index() {
        return employeeRepository.findAll();
    }

    @RequestMapping("/projects/{id}")
    public List<Employee> getEmployeesByProjectId(@PathVariable String id) {
        List<Employee> result = new ArrayList<Employee>();

        List<Employee> employees = employeeRepository.findAll();

        for (Employee emp : employees) {
            if (emp.getProjects().contains(id)) {
                result.add(emp);
            }
        }

        return result;
    }
}