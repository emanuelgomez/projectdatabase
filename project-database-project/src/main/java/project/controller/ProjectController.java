package project.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import project.domain.Project;
import project.domain.ProjectWithEmployees;
import project.client.EmployeesBean;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    private EmployeesBean employeesBean;

    @RequestMapping("/")
    public List<Project> index() {
        return getProjects();
    }

    @RequestMapping("/employees")
    public List<ProjectWithEmployees> getProjectWithEmployees() {
        List<ProjectWithEmployees> result = new ArrayList<ProjectWithEmployees>();

        List<Project> projects = getProjects();

        for (Project p : projects) {
            ProjectWithEmployees pwe = new ProjectWithEmployees(p, employeesBean.getEmployees(p.getId()));
            result.add(pwe);
        }

        return result;
    }

    private List<Project> getProjects() {
    	Project e1 = new Project("1", "Infinitum");
    	Project e2 = new Project("2", "Colon");
    	Project e3 = new Project("3", "Turner");

    	List<Project> projects = new ArrayList<Project>();
    	projects.add(e1);
    	projects.add(e2);
    	projects.add(e3);

    	return projects;
    }
}