package com.example.employeemanagement.repository;

import com.example.employeemanagement.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    
    // Find employee by email
    Optional<Employee> findByEmail(String email);
    
    // Find employees by department
    List<Employee> findByDepartment(String department);
    
    // Find employees by first name containing (case-insensitive)
    List<Employee> findByFirstNameContainingIgnoreCase(String firstName);
    
    // Find employees by last name containing (case-insensitive)
    List<Employee> findByLastNameContainingIgnoreCase(String lastName);
    
    // Find employees with salary greater than specified amount
    List<Employee> findBySalaryGreaterThan(Double salary);
    
    // Find employees by department and salary range
    List<Employee> findByDepartmentAndSalaryBetween(String department, Double minSalary, Double maxSalary);
    
    // Check if employee exists by email
    boolean existsByEmail(String email);
} 