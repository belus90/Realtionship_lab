package com.codeclan.example.relationshipLab.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "employeeNumber")
    private int employeeNumber;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    @JsonIgnoreProperties({"employees"})
    private Department department;

//    @ManyToMany
//    @JsonIgnoreProperties({"employees"})
//    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
//    @JoinTable(
//            name = "employees_projects",
//            joinColumns = {@JoinColumn(
//                    name = "employee_id",
//                    nullable = false,
//                    updatable = false
//            )},
//            inverseJoinColumns = {@JoinColumn(
//                    name = "project_id",
//                    nullable = false,
//                    updatable = false
//            )}
//    )
    private List<Project> projects;


    public Employee(String first_name, String last_name, int employeeNumber, Department department) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.employeeNumber = employeeNumber;
        this.department = department;
        this.projects = new ArrayList<>();
    }

    public Employee() {
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void addProject(Project project){
        this.projects.add(project);
    }
}
