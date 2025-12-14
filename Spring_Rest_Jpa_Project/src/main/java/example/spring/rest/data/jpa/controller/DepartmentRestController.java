package example.spring.rest.data.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.spring.rest.data.jpa.entity.Department;

import example.spring.rest.data.jpa.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentRestController {
@Autowired
	private DepartmentService deptServ;
	
	@PostMapping
	public void createDepartment(@RequestBody Department d) {
		deptServ.createDepartment(d);
	}
	
	@GetMapping
	public List<Department> showAllDepartment(Department d){
		return deptServ.showAllDept(d);
	}
	
	@GetMapping("/{deptId}")
	public Department getOneDept(@PathVariable Integer deptId) {
		return deptServ.getOneDept(deptId);
		
	}
	@DeleteMapping("/{deptId}")
	public void deleteDept(@PathVariable Integer deptId) {
		deptServ.deleteDepartment(deptId);
	}
}
