package com.codeclan.example.relationshipLab;

import com.codeclan.example.relationshipLab.models.Department;
import com.codeclan.example.relationshipLab.models.Employee;
import com.codeclan.example.relationshipLab.models.Project;
import com.codeclan.example.relationshipLab.repositories.DepartmentRepository;
import com.codeclan.example.relationshipLab.repositories.EmployeeRepository;
import com.codeclan.example.relationshipLab.repositories.ProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RelationshipLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Department department = new Department("Engineering");
		departmentRepository.save(department);
		Employee employee1 = new Employee("Johny", "Williamson", 23525, department);
		employeeRepository.save(employee1);
	}
	@Test
	public void addEmployeesAndProject(){
		Department department = new Department("Management");
		departmentRepository.save(department);
		Employee employee = new Employee("Nemeth", "Kati", 23556, department);
		employeeRepository.save(employee);
		Project project = new Project("Lab",23);
		projectRepository.save(project);

		project.addEmployee(employee);
		projectRepository.save(project);

	}
}
