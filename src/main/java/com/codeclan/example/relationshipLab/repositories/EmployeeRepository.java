package com.codeclan.example.relationshipLab.repositories;

import com.codeclan.example.relationshipLab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
