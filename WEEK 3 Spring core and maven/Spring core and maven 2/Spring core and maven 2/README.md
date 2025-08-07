# Spring Core Dependency Injection Example

## Project Structure

- `applicationContext.xml`: Spring configuration file
- `src/main/java/com/example/library/BookRepository.java`: Repository class
- `src/main/java/com/example/library/BookService.java`: Service class with setter injection
- `src/main/java/com/example/library/LibraryManagementApplication.java`: Main class to test DI

## How to Run

1. Make sure you have Maven and JDK installed.
2. Place `applicationContext.xml` in your classpath (e.g., `src/main/resources/`).
3. Build the project with Maven:
   ```
   mvn clean compile
   ```
4. Run the main class:
   ```
   mvn exec:java -Dexec.mainClass="com.example.library.LibraryManagementApplication"
   ```

You should see output indicating that `BookService` and `BookRepository` are working together via Spring DI. 