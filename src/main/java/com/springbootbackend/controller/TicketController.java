package com.springbootbackend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springbootbackend.model.Employee;
import com.springbootbackend.model.Ticket;
import com.springbootbackend.repository.EmployeeRepository;
import com.springbootbackend.repository.TicketRepository;

@Controller
public class TicketController {
	@Autowired
	private TicketRepository ticketRepository;
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/my-tickets/{employeeId}")
	public String getAllTickets(@PathVariable int employeeId, ModelMap model){
		List<Ticket> ticketList = ticketRepository.findAllByEmployeeId(employeeId);
		model.put("tickets", ticketList);
		return "tickets"; 
	}
	
	@GetMapping("/projects/{projectId}/createTicket")
	public String getCreateTicket(@PathVariable("projectId") int projectId, ModelMap model){
		model.put("projectMembers", employeeRepository.findAllByProjectId(projectId));
		return "create-ticket"; 
	}
	
	@PostMapping("/projects/{projectId}/createTicket")
	public String postCreateTicket(@PathVariable("projectId") int projectId,
			ModelMap model, Ticket ticket,
			@RequestParam String title, 
			@RequestParam String description,
			@RequestParam String createdBy,
			@RequestParam int employeeId){
		Optional<Employee> getEmployeeObject = employeeRepository.findById((long) employeeId);
		Employee employeeObject = getEmployeeObject.get();
		String assignedTo = employeeObject.getFirstName();
		ticket.setTitle(title);
		ticket.setDesc(description);
		ticket.setCreatedBy(createdBy);
		ticket.setIssuedTo(assignedTo);
		ticket.setProjectId(projectId);
		ticket.setEmployeeId(employeeId);
		
		ticketRepository.save(ticket);
		
		return "redirect:/projects/{projectId}"; 
	}
	
	@GetMapping("/tickets/{ticketId}")
	public String getSingleTicket(@PathVariable("ticketId") Long ticketId, ModelMap model){
		model.put("ticket", ticketRepository.getById(ticketId));
		return "single-ticket"; 
	}
}
