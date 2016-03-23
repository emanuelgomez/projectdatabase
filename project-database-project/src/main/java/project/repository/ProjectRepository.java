package project.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import project.domain.Project;

public interface ProjectRepository extends MongoRepository<Project, String> {

    public Project findByName(String firstName);
}
