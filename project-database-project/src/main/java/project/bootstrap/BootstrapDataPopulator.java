package project.bootstrap;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.InitializingBean;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import project.domain.Project;
import project.repository.ProjectRepository;


@Service
public class BootstrapDataPopulator implements InitializingBean {

    @Autowired
    ProjectRepository projectRepository;

    @Override
    public void afterPropertiesSet() throws Exception {
        generateDummyProjects();
    }


    private void generateDummyProjects() {
        Project e1 = new Project("1", "Infinitum-F3");
        Project e2 = new Project("2", "Colon-F1");
        Project e3 = new Project("3", "Turner-F1");

        List<Project> projects = new ArrayList<Project>();
        projects.add(e1);
        projects.add(e2);
        projects.add(e3);

        for (Project emp : projects) {
            projectRepository.save(emp);
        }
    }
}