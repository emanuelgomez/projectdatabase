package project.domain;

import java.util.List;

public class Employee {

	private String id;
	private String name;
	private String homeState;
	private List<String> projects;

	public Employee() {

	}

	public Employee (String id, String name, String homeState, List<String> projects) {
		super();
		this.id = id;
		this.name = name;
		this.homeState = homeState;
		this.projects = projects;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHomeState() {
		return this.homeState;
	}

	public void setHomeState(String homeState) {
		this.homeState = homeState;
	}

	public List<String> getProjects() {
		return this.projects;
	}

	public void setProjects(List<String> projects) {
		this.projects = projects;
	}

}