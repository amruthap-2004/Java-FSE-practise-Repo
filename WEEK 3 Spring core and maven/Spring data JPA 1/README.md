# Spring Data JPA Example

This project demonstrates a simple Spring Boot application using Spring Data JPA and MySQL.

## Features

- Spring Boot 3.x
- Spring Data JPA
- MySQL integration
- Basic CRUD operations on a `Country` entity

## Prerequisites

- Java 17 or higher
- Maven
- MySQL Server

## Setup Instructions

1. **Clone the repository:**
   ```sh
   git clone <your-github-repo-url>
   cd "Spring Data JPA 1"
   ```

2. **Configure the database:**
   - Create a MySQL database named `ormlearn`.
   - Update `src/main/resources/application.properties` with your MySQL username and password.

3. **Create the `country` table:**
   ```sql
   CREATE TABLE country (
       co_code VARCHAR(2) PRIMARY KEY,
       co_name VARCHAR(50)
   );

   INSERT INTO country VALUES ('IN', 'India');
   INSERT INTO country VALUES ('US', 'United States of America');
   ```

4. **Build the project:**
   ```sh
   mvn clean install
   ```

5. **Run the application:**
   ```sh
   mvn spring-boot:run
   ```
   or run `OrmLearnApplication.java` from your IDE.

## Project Structure

```
src/
 ├── main/
 │    ├── java/
 │    │    └── com/cognizant/orm_learn/
 │    │         ├── OrmLearnApplication.java
 │    │         ├── Country.java
 │    │         ├── CountryRepository.java
 │    │         └── CountryService.java
 │    └── resources/
 │         └── application.properties
 └── test/
```

## License

This project is for educational purposes. 