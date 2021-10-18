package com.springbootbackend.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.springbootbackend.model.Project;
import com.springbootbackend.repository.ProjectRepository;

@Controller
public class ProjectController {
	@Autowired
	private ProjectRepository projectRepository;

	@GetMapping("/projects")
	public String getAllProjects(ModelMap model){
		List<Project> projectList = projectRepository.findAll();
		model.put("projects", projectList);
		return "projects"; 
	}
	
	@GetMapping("/projects/{projectId}")
	public String getSingleProject(@PathVariable("projectId") Long projectId, ModelMap model){	
		model.put("project", projectRepository.getById(projectId));
		return "single-project"; 
	}

}
