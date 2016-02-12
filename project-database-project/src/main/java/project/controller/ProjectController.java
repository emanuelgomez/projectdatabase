package project.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ProjectController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Project!";
    }
}