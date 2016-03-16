package project.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import project.domain.Employee;

@FeignClient(name="employee")
public interface EmployeesClient {
	
	@RequestMapping(method = RequestMethod.GET, value="/projects/{projectId}")
	List<Employee> getEmployees(@PathVariable("projectId") String projectId);
	
}