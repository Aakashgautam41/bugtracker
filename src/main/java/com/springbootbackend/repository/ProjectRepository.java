package com.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootbackend.model.Project;
@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{

}
