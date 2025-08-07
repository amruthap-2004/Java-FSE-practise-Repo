# LibraryManagement

This is a sample Maven project for a Library Management application, created as part of a Spring and Maven exercise.

## Project Structure
- **Maven Project Name:** LibraryManagement
- **Group ID:** com.example.library
- **Artifact ID:** LibraryManagement
- **Java Version:** 1.8

## Dependencies
The following dependencies are included in `pom.xml`:
- Spring Context
- Spring AOP
- Spring WebMVC
- AspectJ Weaver (for AOP support)

## Plugins
- Maven Compiler Plugin (configured for Java 1.8)

## Source Structure
- `App.java`: Main entry point for the application
- `AppConfig.java`: Spring configuration class
- `Book.java`: Model class representing a book
- `BookService.java`: Service class for book operations
- `BookController.java`: REST controller for book endpoints
- `LoggingAspect.java`: Example aspect for logging (AOP)

## How to Build
1. Open a terminal and navigate to the `LibraryManagement` directory:
   ```
   cd "C:\Users\DELL\OneDrive\Desktop\Spring core and maven 4\LibraryManagement"
   ```
2. Build the project using Maven:
   ```
   mvn clean package
   ```
   The output JAR will be in the `target/` directory.

## Notes
- This project demonstrates Maven setup and Spring configuration only, as per the assignment instructions.
- No web server or Spring Boot setup is included, since it was not required.
- To run the main method (for demonstration), use:
  ```
  java -cp target/LibraryManagement-1.0-SNAPSHOT.jar com.example.library.App
  ``` 