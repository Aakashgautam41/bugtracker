package com.springbootbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootbackend.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	public Employee findByEmailId(String email);
	public List<Employee> findAllByProjectId(int projectId);

}