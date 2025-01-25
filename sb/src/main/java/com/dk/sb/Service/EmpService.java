package com.dk.sb.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dk.sb.Entity.Employee;
import com.dk.sb.Repository.EmpRepo;

@Component
public class EmpService {
		
		@Autowired
		EmpRepo er;
		
		public List<Employee> getAll() {
			return (List<Employee>)er.findAll();
		}

		public Employee getOneId(int id) {
			Employee e = er.findById(id);
			return e;
		}

		public String send(Employee e) {
			er.save(e);
			return "success";
		}

		public String update(int id, Employee e) {
			Employee e1 = er.findById(id);
			e1.setuDesig(e1.getuDesig());
			er.save(e1);
			return "success";
		}

		public String delete(int id) {
			er.delete(getOneId(id));
			return "deleted";
		}
}
