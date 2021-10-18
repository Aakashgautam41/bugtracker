package com.springbootbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "Projects")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long projectId;
	@Column
	private String projectName;
	@Column
	private String description;
 
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(String projectName, String description) {
		super();
		this.projectName = projectName;
		this.description = description;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		description = description;
	}
	
		 
}
