package com.dk.sb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.dk.sb.Entity.Employee;

@Component
public interface EmpRepo extends JpaRepository<Employee,Integer>{
	
	Employee findById(int id);
}
