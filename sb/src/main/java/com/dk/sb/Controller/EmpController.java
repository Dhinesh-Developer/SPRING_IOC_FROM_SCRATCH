package com.dk.sb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dk.sb.Entity.Employee;
import com.dk.sb.Service.EmpService;

@RestController
public class EmpController {
	@Autowired
	EmpService es;
	
	@GetMapping("/user")
	public List<Employee> getAllEmp() {
		return es.getAll();
	}
	
	@GetMapping("/user/{u_Id}")
	public Employee getOneEmp(@PathVariable("u_Id") int id) {
		return es.getOneId(id);
	}
	
	
	@PostMapping("/user")
	public String insertEmp(@RequestBody Employee e) {
		return es.send(e);
	}
	
	@PutMapping("/user/{u_Id}")
	public String  updateEmp(@PathVariable("u_Id") int id,@RequestBody Employee e) {
		return es.update(id,e);
	}
	
	@DeleteMapping("/user/{u_Id}")
	public String deleteEmp(@PathVariable("u_Id") int id) {
		return es.delete(id);
	}
	
	
	
	
}
