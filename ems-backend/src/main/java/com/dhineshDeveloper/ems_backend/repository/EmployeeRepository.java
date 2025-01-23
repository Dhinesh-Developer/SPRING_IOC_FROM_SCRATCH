package com.dhineshDeveloper.ems_backend.repository;

import com.dhineshDeveloper.ems_backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
