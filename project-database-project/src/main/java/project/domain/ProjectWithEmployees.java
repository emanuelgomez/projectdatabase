package project.domain;

import java.util.List;

public class ProjectWithEmployees extends Project {
	private List<Employee> employees;

	public ProjectWithEmployees(Project p, List<Employee> employees) {
		super(p.getId(), p.getName());
		this.employees = employees;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}