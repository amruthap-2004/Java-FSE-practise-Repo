package com.example.employeemanagement.service;

import com.example.employeemanagement.entity.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository employeeRepository;
    
    // Save a new employee
    public Employee saveEmployee(Employee employee) {
        // Check if email already exists
        if (employeeRepository.existsByEmail(employee.getEmail())) {
            throw new RuntimeException("Employee with email " + employee.getEmail() + " already exists!");
        }
        return employeeRepository.save(employee);
    }
    
    // Get all employees
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    
    // Get employee by ID
    public Optional<Employee> getEmployeeById(Integer id) {
        return employeeRepository.findById(id);
    }
    
    // Get employee by email
    public Optional<Employee> getEmployeeByEmail(String email) {
        return employeeRepository.findByEmail(email);
    }
    
    // Update employee
    public Employee updateEmployee(Integer id, Employee employeeDetails) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
        
        // Check if email is being changed and if it already exists
        if (!employee.getEmail().equals(employeeDetails.getEmail()) && 
            employeeRepository.existsByEmail(employeeDetails.getEmail())) {
            throw new RuntimeException("Employee with email " + employeeDetails.getEmail() + " already exists!");
        }
        
        employee.setFirstName(employeeDetails.getFirstName());
        employee.setLastName(employeeDetails.getLastName());
        employee.setEmail(employeeDetails.getEmail());
        employee.setPhone(employeeDetails.getPhone());
        employee.setHireDate(employeeDetails.getHireDate());
        employee.setSalary(employeeDetails.getSalary());
        employee.setDepartment(employeeDetails.getDepartment());
        
        return employeeRepository.save(employee);
    }
    
    // Delete employee
    public void deleteEmployee(Integer id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
        employeeRepository.delete(employee);
    }
    
    // Get employees by department
    public List<Employee> getEmployeesByDepartment(String department) {
        return employeeRepository.findByDepartment(department);
    }
    
    // Search employees by first name
    public List<Employee> searchEmployeesByFirstName(String firstName) {
        return employeeRepository.findByFirstNameContainingIgnoreCase(firstName);
    }
    
    // Search employees by last name
    public List<Employee> searchEmployeesByLastName(String lastName) {
        return employeeRepository.findByLastNameContainingIgnoreCase(lastName);
    }
    
    // Get employees with salary greater than specified amount
    public List<Employee> getEmployeesWithSalaryGreaterThan(Double salary) {
        return employeeRepository.findBySalaryGreaterThan(salary);
    }
    
    // Get employees by department and salary range
    public List<Employee> getEmployeesByDepartmentAndSalaryRange(String department, Double minSalary, Double maxSalary) {
        return employeeRepository.findByDepartmentAndSalaryBetween(department, minSalary, maxSalary);
    }
    
    // Check if employee exists by email
    public boolean employeeExistsByEmail(String email) {
        return employeeRepository.existsByEmail(email);
    }
} 