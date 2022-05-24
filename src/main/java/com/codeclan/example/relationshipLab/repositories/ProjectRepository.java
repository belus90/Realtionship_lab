package com.codeclan.example.relationshipLab.repositories;

import com.codeclan.example.relationshipLab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
