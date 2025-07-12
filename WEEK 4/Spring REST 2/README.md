# Spring Core - Load Country from Spring Configuration XML

This project demonstrates how to load country data from a Spring XML configuration file using Spring Core concepts.

## Project Overview

An airlines website needs to support booking for four countries with a dropdown on the home page. The project stores country information including the two-character ISO code for each country.

### Country Data
| Code | Name |
|------|------|
| US   | United States |
| DE   | Germany |
| IN   | India |
| JP   | Japan |

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── cognizant/
│   │           └── springlearn/
│   │               ├── Country.java
│   │               └── SpringLearnApplication.java
│   └── resources/
│       ├── country.xml
│       └── logback.xml
└── pom.xml
```

## How to Run

1. **Compile the project:**
   ```bash
   mvn clean compile
   ```

2. **Run the application:**
   ```bash
   mvn exec:java -Dexec.mainClass="com.cognizant.springlearn.SpringLearnApplication"
   ```

3. **Or run using Maven:**
   ```bash
   mvn clean package
   java -cp target/spring-learn-1.0.0.jar:target/lib/* com.cognizant.springlearn.SpringLearnApplication
   ```

## Key Components

### 1. Country.java
- Contains instance variables for `code` and `name`
- Implements empty parameter constructor with debug logging
- Includes getters and setters with debug logging
- Overrides `toString()` method

### 2. country.xml
- Spring XML configuration file
- Defines a bean with id "country" and class "com.cognizant.springlearn.Country"
- Sets properties for code ("IN") and name ("India")

### 3. SpringLearnApplication.java
- Main application class
- Contains `displayCountry()` method that reads the country bean
- Uses `ClassPathXmlApplicationContext` to load the configuration
- Displays country details using `context.getBean()`

## Spring Concepts Explained

### Bean Tag Components:
- **`<bean>`**: Defines a Spring bean
- **`id` attribute**: Unique identifier for the bean
- **`class` attribute**: Fully qualified class name
- **`<property>` tag**: Sets bean properties
- **`name` attribute**: Property name (maps to setter method)
- **`value` attribute**: Property value to set

### ApplicationContext:
- **`ApplicationContext`**: Spring's IoC container interface
- **`ClassPathXmlApplicationContext`**: Implementation that loads configuration from classpath
- **`context.getBean()`**: Retrieves bean instances from the container

### What happens when `context.getBean()` is invoked:
1. Spring container reads the XML configuration
2. Creates the Country object using the empty constructor
3. Calls setter methods to inject property values
4. Returns the fully configured bean instance
5. Debug logs show the constructor and setter method calls

## Expected Output

When you run the application, you should see debug logs showing:
- "Inside Country Constructor."
- "Inside setCode() method"
- "Inside setName() method"
- "Inside getCode() method"
- "Inside getName() method"
- "Country : Country [code=IN, name=India]"

This demonstrates the complete lifecycle of bean creation and property injection in Spring.

## Screenshot

Here's a screenshot showing the application running successfully:

```
17:03:49.017 [com.cognizant.springlearn.SpringLearnApplication.main()] INFO  c.c.s.SpringLearnApplication - Starting Spring Learn Application
17:03:49.019 [com.cognizant.springlearn.SpringLearnApplication.main()] INFO  c.c.s.SpringLearnApplication - Inside displayCountry() method
17:03:49.371 [com.cognizant.springlearn.Country - Inside Country Constructor.
17:03:49.434 [com.cognizant.springlearn.Country - Inside setCode() method
17:03:49.434 [com.cognizant.springlearn.Country - Inside setName() method
17:03:49.463 [com.cognizant.springlearn.SpringLearnApplication.main()] DEBUG c.c.s.SpringLearnApplication - Country : Country [code=IN, name=India]
Country Details: Country [code=IN, name=India]
17:03:49.466 [com.cognizant.springlearn.SpringLearnApplication.main()] INFO  c.c.s.SpringLearnApplication - Spring Learn Application completed
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.661 s
[INFO] Finished at: 2025-07-12T17:03:49+05:30
[INFO] ------------------------------------------------------------------------
```

