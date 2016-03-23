package project.domain;

import org.springframework.data.annotation.Id;

public class Project {

	@Id
	private String id;
	private String name;

	public Project (String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}
}