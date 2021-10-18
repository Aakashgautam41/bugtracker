package com.springbootbackend.model;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "Tickets")
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ticketId;
	@Column
	private int projectId;
	@Column
	private String createdBy;
	@Column
	private String issuedTo;
	@Column
	private String title;
	@Column
	private String desc;
	@Column
	private int employeeId;
	
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ticket(int projectId, String createdBy, String issuedTo, String title, String desc, int employeeId) {
		super();
		this.projectId = projectId;
		this.createdBy = createdBy;
		this.issuedTo = issuedTo;
		this.title = title;
		this.desc = desc;
		this.employeeId = employeeId;
	}

	public Long getTicketId() {
		return ticketId;
	}

	public void setTicketId(Long ticketId) {
		ticketId = ticketId;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getIssuedTo() {
		return issuedTo;
	}

	public void setIssuedTo(String issuedTo) {
		this.issuedTo = issuedTo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	
	
	
}
