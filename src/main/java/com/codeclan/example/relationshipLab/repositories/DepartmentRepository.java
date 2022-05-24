package com.codeclan.example.relationshipLab.repositories;

import com.codeclan.example.relationshipLab.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
