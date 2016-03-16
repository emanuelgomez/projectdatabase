package project.client;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import project.domain.Employee;
import java.util.List;
import java.util.ArrayList;

/**
* Tengo que wrapear EmployeesClient dado que aun no puedo integrar Hystrix con FeignClients
* Ver: https://github.com/spring-cloud/spring-cloud-netflix/issues/207
*/
@Service
public class EmployeesBean {

	@Autowired
    private EmployeesClient employeesClient;
	
   @HystrixCommand(fallbackMethod = "defaultEmployees")
	public List<Employee> getEmployees(String projectId) {
		return employeesClient.getEmployees(projectId);
	}
	
	public List<Employee> defaultEmployees(String projectId) {
		return new ArrayList<Employee>();
	}
}