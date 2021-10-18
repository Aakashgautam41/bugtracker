package com.springbootbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootbackend.model.Employee;
import com.springbootbackend.model.Project;
import com.springbootbackend.model.Ticket;
@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long>{
	public List<Ticket> findAllByEmployeeId(int employeeId);
}
