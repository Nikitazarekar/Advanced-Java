package example.spring.rest.data.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import example.spring.rest.data.jpa.entity.Department;
import example.spring.rest.data.jpa.repo.DepartmentRepository;

@Service
public class DepartmentService {
@Autowired
	private DepartmentRepository deptRepo;
	
	public void createDepartment(Department dept) {
		deptRepo.save(dept);
	}
	public List<Department> showAllDept(Department dept){
		return deptRepo.findAll();
	}
	public Department getOneDept(Integer deptId) {
		return deptRepo.findById(deptId).orElse(null);
	}
	
	public void deleteDepartment(Integer deptId) {
		deptRepo.deleteById(deptId);
	}
	
}
