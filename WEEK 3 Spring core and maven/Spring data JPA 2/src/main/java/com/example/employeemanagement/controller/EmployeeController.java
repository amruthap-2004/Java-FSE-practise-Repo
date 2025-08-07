package com.example.employeemanagement.controller;

import com.example.employeemanagement.entity.Employee;
import com.example.employeemanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin(origins = "*")
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;
    
    // Create a new employee
    @PostMapping
    public ResponseEntity<?> createEmployee(@RequestBody Employee employee) {
        try {
            Employee savedEmployee = employeeService.saveEmployee(employee);
            return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
    
    // Get all employees
    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employees = employeeService.getAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
    
    // Get employee by ID
    @GetMapping("/{id}")
    public ResponseEntity<?> getEmployeeById(@PathVariable Integer id) {
        Optional<Employee> employee = employeeService.getEmployeeById(id);
        if (employee.isPresent()) {
            return new ResponseEntity<>(employee.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Employee not found with id: " + id, HttpStatus.NOT_FOUND);
        }
    }
    
    // Get employee by email
    @GetMapping("/email/{email}")
    public ResponseEntity<?> getEmployeeByEmail(@PathVariable String email) {
        Optional<Employee> employee = employeeService.getEmployeeByEmail(email);
        if (employee.isPresent()) {
            return new ResponseEntity<>(employee.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Employee not found with email: " + email, HttpStatus.NOT_FOUND);
        }
    }
    
    // Update employee
    @PutMapping("/{id}")
    public ResponseEntity<?> updateEmployee(@PathVariable Integer id, @RequestBody Employee employeeDetails) {
        try {
            Employee updatedEmployee = employeeService.updateEmployee(id, employeeDetails);
            return new ResponseEntity<>(updatedEmployee, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
    
    // Delete employee
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable Integer id) {
        try {
            employeeService.deleteEmployee(id);
            return new ResponseEntity<>("Employee deleted successfully", HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
    
    // Get employees by department
    @GetMapping("/department/{department}")
    public ResponseEntity<List<Employee>> getEmployeesByDepartment(@PathVariable String department) {
        List<Employee> employees = employeeService.getEmployeesByDepartment(department);
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
    
    // Search employees by first name
    @GetMapping("/search/firstname/{firstName}")
    public ResponseEntity<List<Employee>> searchEmployeesByFirstName(@PathVariable String firstName) {
        List<Employee> employees = employeeService.searchEmployeesByFirstName(firstName);
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
    
    // Search employees by last name
    @GetMapping("/search/lastname/{lastName}")
    public ResponseEntity<List<Employee>> searchEmployeesByLastName(@PathVariable String lastName) {
        List<Employee> employees = employeeService.searchEmployeesByLastName(lastName);
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
    
    // Get employees with salary greater than specified amount
    @GetMapping("/salary/greater-than/{salary}")
    public ResponseEntity<List<Employee>> getEmployeesWithSalaryGreaterThan(@PathVariable Double salary) {
        List<Employee> employees = employeeService.getEmployeesWithSalaryGreaterThan(salary);
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
    
    // Get employees by department and salary range
    @GetMapping("/department/{department}/salary-range")
    public ResponseEntity<List<Employee>> getEmployeesByDepartmentAndSalaryRange(
            @PathVariable String department,
            @RequestParam Double minSalary,
            @RequestParam Double maxSalary) {
        List<Employee> employees = employeeService.getEmployeesByDepartmentAndSalaryRange(department, minSalary, maxSalary);
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
    
    // Check if employee exists by email
    @GetMapping("/exists/email/{email}")
    public ResponseEntity<Boolean> employeeExistsByEmail(@PathVariable String email) {
        boolean exists = employeeService.employeeExistsByEmail(email);
        return new ResponseEntity<>(exists, HttpStatus.OK);
    }
} 