package com.springbootbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springbootbackend.model.Employee;
import com.springbootbackend.repository.EmployeeRepository;
import com.springbootbackend.repository.ProjectRepository;

@Controller
@SessionAttributes({"name" ,"email", "password","employeeId"})
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private ProjectRepository projectRepository;
	
	//get all employees
	@GetMapping("/employees")
	public List<Employee>  getAllEmployees(){
		return employeeRepository.findAll();
	}
	@GetMapping("/")
	public String getIndexPage(ModelMap model) {
		return "index";
	}
	
	@GetMapping("/register")
	public String getRegisterPage(ModelMap model) {
		model.put("projectList", projectRepository.findAll());
		return "register";
	}
	@PostMapping("/register")
	public String postRegisterPage(ModelMap model,Employee employee,
			@RequestParam("firstName")String firstName,
			@RequestParam("lastName")String lastName,
			@RequestParam("email")String email,
			@RequestParam("password")String password,
			@RequestParam("projectId")int projectId
			) {
	
		employee.setEmailId(email);
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setPassword(password);
		employee.setProjectId(projectId);
		employeeRepository.save(employee);
		
		return "redirect:/login";
		
	}
	
	@GetMapping("/login")
	public String getLoginPage() {
		return "login";
	}
	
	@PostMapping("/login")
	public String postLoginPage(ModelMap model, @RequestParam String email, @RequestParam String password) {
		Employee data = employeeRepository.findByEmailId(email);
		System.out.println("data outside: " + data);
		if(data == null) {
			System.out.println("data: " + data);
			model.put("error", "Email address doesn't exist");
			return "login";
		}
		String userEmail = data.getEmailId();
		String fName = data.getFirstName();
		Long employeeId = data.getId();
		model.put("name", fName);
		String pass = data.getPassword();
		if(!userEmail.equalsIgnoreCase(email)  || !pass.equalsIgnoreCase(password)) {
			System.out.println("inside if");
			System.out.println("email: " + email);
			System.out.println("password: " + password);
			model.put("error", "Wrong password");
			return "login";
		}
		System.out.println("outside if");
		model.put("email", email);
		model.put("password", password);
		model.put("employeeId", employeeId);

		return "redirect:/";
	}
}





