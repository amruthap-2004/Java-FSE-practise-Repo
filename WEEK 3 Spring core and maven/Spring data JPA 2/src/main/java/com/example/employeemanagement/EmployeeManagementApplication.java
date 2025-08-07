package com.example.employeemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(EmployeeManagementApplication.class, args);
        System.out.println("Employee Management System is running on http://localhost:8080");
        System.out.println("API Documentation:");
        System.out.println("GET    /api/employees - Get all employees");
        System.out.println("POST   /api/employees - Create new employee");
        System.out.println("GET    /api/employees/{id} - Get employee by ID");
        System.out.println("PUT    /api/employees/{id} - Update employee");
        System.out.println("DELETE /api/employees/{id} - Delete employee");
        System.out.println("GET    /api/employees/department/{department} - Get employees by department");
        System.out.println("GET    /api/employees/search/firstname/{firstName} - Search by first name");
        System.out.println("GET    /api/employees/search/lastname/{lastName} - Search by last name");
        System.out.println("GET    /api/employees/salary/greater-than/{salary} - Get employees with salary > amount");
    }
} 