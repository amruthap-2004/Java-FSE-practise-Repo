# Employee Management System - Spring Data JPA

A complete Employee Management System built with Spring Boot, Spring Data JPA, and MySQL. This project demonstrates the power and simplicity of Spring Data JPA over traditional Hibernate.

## 🚀 Features

- **CRUD Operations**: Create, Read, Update, Delete employees
- **RESTful API**: Complete REST endpoints for all operations
- **Database Integration**: MySQL with automatic table creation
- **Search & Filter**: Find employees by department, name, salary
- **Data Validation**: Email uniqueness, required fields validation
- **Error Handling**: Proper HTTP status codes and error messages

## 🛠️ Technologies Used

- **Spring Boot 3.2.0**
- **Spring Data JPA**
- **MySQL 8.0**
- **Hibernate 6.3.1**
- **Maven**
- **Java 17**

## 📋 Prerequisites

- Java 17 or higher
- MySQL 8.0 or higher
- Maven 3.6 or higher
- Eclipse/IntelliJ IDEA/VS Code

## 🚀 Quick Start

### 1. Clone the Repository
```bash
git clone <your-repo-url>
cd employee-management
```

### 2. Database Setup
1. Start MySQL server
2. Create database (optional - Spring Boot will create it automatically)
3. Update `src/main/resources/application.properties` with your MySQL credentials:
```properties
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### 3. Run the Application

#### Option A: Using Maven
```bash
mvn clean package
java -jar target/employee-management-1.0.0.jar
```

#### Option B: Using IDE
1. Import as Maven project
2. Run `EmployeeManagementApplication.java`

### 4. Test the API
The application will start on `http://localhost:8080`

## 📚 API Documentation

### Base URL: `http://localhost:8080/api/employees`

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/` | Get all employees |
| POST | `/` | Create new employee |
| GET | `/{id}` | Get employee by ID |
| PUT | `/{id}` | Update employee |
| DELETE | `/{id}` | Delete employee |
| GET | `/department/{department}` | Get employees by department |
| GET | `/search/firstname/{firstName}` | Search by first name |
| GET | `/search/lastname/{lastName}` | Search by last name |
| GET | `/salary/greater-than/{salary}` | Get employees with salary > amount |
| GET | `/exists/email/{email}` | Check if email exists |

### Example Requests

#### Create Employee
```bash
curl -X POST http://localhost:8080/api/employees \
  -H "Content-Type: application/json" \
  -d '{
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@example.com",
    "phone": "123-456-7890",
    "hireDate": "2024-01-15",
    "salary": 50000.0,
    "department": "IT"
  }'
```

#### Get All Employees
```bash
curl -X GET http://localhost:8080/api/employees
```

#### Get Employee by ID
```bash
curl -X GET http://localhost:8080/api/employees/1
```

## 🏗️ Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/example/employeemanagement/
│   │       ├── controller/
│   │       │   └── EmployeeController.java
│   │       ├── entity/
│   │       │   └── Employee.java
│   │       ├── repository/
│   │       │   └── EmployeeRepository.java
│   │       ├── service/
│   │       │   └── EmployeeService.java
│   │       └── EmployeeManagementApplication.java
│   └── resources/
│       └── application.properties
└── test/
    └── java/
```

## 🔧 Configuration

### Database Configuration
The application uses MySQL with the following default settings:
- **Database**: `employee_db` (auto-created)
- **Table**: `employees` (auto-created)
- **Port**: 3306
- **Server**: localhost

### Application Properties
Key configuration options in `application.properties`:
- `spring.jpa.hibernate.ddl-auto=update` - Auto-create/update tables
- `spring.jpa.show-sql=true` - Show SQL queries in logs
- `server.port=8080` - Application port

## 🧪 Testing

Use the provided `test-api.bat` file to test all endpoints:
```bash
.\test-api.bat
```

## 📊 Database Schema

The `employees` table includes:
- `id` (Primary Key, Auto-increment)
- `first_name` (Required)
- `last_name` (Required)
- `email` (Required, Unique)
- `phone`
- `hire_date`
- `salary`
- `department`

## 🎯 Key Features Demonstrated

### Spring Data JPA vs Traditional Hibernate

**Traditional Hibernate:**
```java
Session session = factory.openSession();
Transaction tx = null;
try {
    tx = session.beginTransaction();
    employeeID = (Integer) session.save(employee); 
    tx.commit();
} catch (HibernateException e) {
    if (tx != null) tx.rollback();
} finally {
    session.close(); 
}
```

**Spring Data JPA:**
```java
@Autowired
private EmployeeRepository employeeRepository;

@Transactional
public void addEmployee(Employee employee) {
    employeeRepository.save(employee);
}
```

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

## 📄 License

This project is licensed under the MIT License.

## 👨‍💻 Author

Your Name - Spring Data JPA Learning Project

---

**Happy Coding! 🚀** 