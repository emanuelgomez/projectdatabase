package project.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import project.domain.Project;
import project.domain.ProjectWithEmployees;
import project.client.EmployeesBean;
import project.repository.ProjectRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    private EmployeesBean employeesBean;

    @Autowired
    ProjectRepository projectRepository;

    @RequestMapping("/")
    public List<Project> index() {
        return projectRepository.findAll();
    }

    @RequestMapping("/employees")
    public List<ProjectWithEmployees> getProjectWithEmployees() {
        List<ProjectWithEmployees> result = new ArrayList<ProjectWithEmployees>();

        List<Project> projects = projectRepository.findAll();

        for (Project p : projects) {
            ProjectWithEmployees pwe = new ProjectWithEmployees(p, employeesBean.getEmployees(p.getId()));
            result.add(pwe);
        }

        return result;
    }


}