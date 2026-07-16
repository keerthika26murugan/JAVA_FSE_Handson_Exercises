# Java FSE Hanson Exercises

This repository documents the exercises completed during the **Java Full Stack Engineering (FSE) Digital Nurture Program**. The exercises cover Core Java, Spring Framework, Spring Boot, Spring Data JPA, Hibernate, RESTful Web Services, Microservices, Testing, Logging, JWT Authentication, and Database Programming.

---

# Week 1 – Core Java, Design Patterns, Testing & Logging

## Modules Covered

### 1. Design Principles & Design Patterns
**Objective:** Learn software design principles and implement commonly used design patterns.

### Topics
- SOLID Principles
- Singleton Pattern
- Factory Pattern
- Builder Pattern
- Dependency Injection (Concept)

---

### 2. Data Structures & Algorithms

**Objective:** Solve programming problems using efficient algorithms.

### Topics

- Arrays
- Strings
- Searching
- Sorting
- Time Complexity
- Space Complexity

---

### 3. PL/SQL Programming

**Objective:** Develop database programs using Oracle PL/SQL.

### Topics

- Procedures
- Functions
- Cursors
- Triggers
- Exception Handling
- Packages

---

### 4. Test Driven Development (JUnit 5 & Mockito)

**Objective:** Learn unit testing and mocking techniques.

### Topics

- JUnit 5
- Assertions
- Test Fixtures
- Mockito
- Mock Objects
- Stubbing
- Verify Methods

---

### 5. SLF4J Logging Framework

**Objective:** Implement logging for monitoring and debugging.

### Topics

- SLF4J
- Logback
- Logger Configuration
- Logging Levels
- Console Logging

---

## Learning Outcomes

- Core Java Programming
- Object-Oriented Programming
- Design Patterns
- Algorithm Design
- Database Programming
- Unit Testing
- Mocking
- Application Logging

---

# Week 2 – Spring Framework, Spring Boot, Spring Data JPA & Hibernate

## 1. Spring Core with Maven

**Objective:** Learn Spring Framework fundamentals using Maven.

### Topics

- Spring IoC Container
- Dependency Injection
- Bean Configuration
- Constructor Injection
- Setter Injection
- Maven Project Structure

---

## 2. Spring Boot & Spring Data JPA

### Exercise 1 – Employee Management System

**Objective:** Configure Spring Boot with Spring Data JPA.

### Topics

- Spring Boot Setup
- Maven
- H2 Database
- Entity Mapping
- Department Entity
- Employee Entity
- One-To-Many Mapping
- Many-To-One Mapping

---

### Exercise 2 – CRUD Repository & REST API

**Objective:** Perform CRUD operations using Spring Data JPA.

### Topics

- JpaRepository
- REST Controller
- GET API
- POST API
- DELETE API
- Pagination
- Sorting

---

### Exercise 3 – Advanced Hibernate Features

**Objective:** Learn advanced persistence concepts.

### Topics

- Hibernate
- JPA Auditing
- CreatedDate
- LastModifiedDate
- Projection
- Batch Processing
- Multiple Datasource (Concept)

---

## Learning Outcomes

- Spring Framework
- Spring Boot
- Dependency Injection
- ORM using Hibernate
- Spring Data JPA
- REST APIs
- Maven Project Management

---

# Week 3 – Spring REST, JWT Authentication & Spring Security

## Exercise 1 – Spring REST Web Services

### Objectives

Develop RESTful web services using Spring Boot.

### Topics

- REST Architecture
- @RestController
- @RequestMapping
- @GetMapping
- @PostMapping
- @PathVariable
- @RequestBody
- ResponseEntity

---

## Exercise 2 – Country REST API

### Features

- Retrieve country details
- JSON Response
- REST Endpoint Mapping

### Sample Endpoint

```
GET /country
```

---

## Exercise 3 – JWT Authentication

### Objective

Implement secure authentication using JSON Web Token (JWT).

### Components Created

- AuthenticationController
- AuthenticationRequest
- AuthenticationResponse
- JwtUserDetailsService
- JwtUtil
- JwtRequestFilter
- SecurityConfig

---

### Topics Covered

- Spring Security
- AuthenticationManager
- UserDetailsService
- JWT Token Generation
- JWT Validation
- Security Filter Chain
- Authentication Flow

---

### Sample Endpoint

```
POST /authenticate
```

---

### Learning Outcomes

- Spring Security
- JWT Authentication
- Secure REST APIs
- Token Based Authentication
- Authentication Filters

---

# Week 4 – Microservices

## Exercise 1 – Account Microservice

### Objective

Create a RESTful Account Microservice.

### Technologies

- Spring Boot
- Spring Web
- Maven

### REST API

```
GET /accounts/{number}
```

Example

```
http://localhost:8080/accounts/00987987973432
```

Sample Response

```json
{
  "number":"00987987973432",
  "type":"savings",
  "balance":234343
}
```

---

## Exercise 2 – Loan Microservice

### Objective

Create an independent Loan Microservice.

### Technologies

- Spring Boot
- Spring Web
- Maven

### Configuration

```
server.port=8081
```

### REST API

```
GET /loans/{number}
```

Example

```
http://localhost:8081/loans/H00987987972342
```

Sample Response

```json
{
  "number":"H00987987972342",
  "type":"car",
  "loan":400000,
  "emi":3258,
  "tenure":18
}
```

---

## Microservices Folder Structure

```
Week-4
└── Microservices
    ├── account
    └── loan
```

---

## Learning Outcomes

- Microservices Architecture
- Spring Boot REST APIs
- Multiple Maven Projects
- Independent Deployment
- Port Configuration
- JSON Response Handling
- Browser & CURL API Testing

---

# Technologies Used

- Java 21
- Maven
- Spring Framework
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- REST API
- JWT Authentication
- Microservices
- H2 Database
- JUnit 5
- Mockito
- SLF4J
- Logback
- Git
- GitHub
- Visual Studio Code

---

# Repository Structure

```text
JAVA_FSE_Hanson_Exercises

├── Week-1
│   ├── Design Patterns
│   ├── Data Structures & Algorithms
│   ├── PL SQL
│   ├── TDD using JUnit5 & Mockito
│   └── SLF4J Logging
│
├── Week-2
│   ├── Spring Core Maven
│   └── Spring Data JPA & Hibernate
│
├── Week-3
│   ├── HelloWorldREST
│   ├── CountryREST
│   ├── CreateSpringWebProject
│   ├── LoadCountryXML
│   └── JWTAuthentication
│
├── Week-4
│   └── Microservices
│       ├── account
│       └── loan
│
└── README.md
```

---

# Overall Learning Outcomes

Through these exercises, I gained practical experience in:

- Java Programming
- Object-Oriented Programming (OOP)
- Design Patterns
- Data Structures & Algorithms
- PL/SQL Programming
- Spring Framework
- Spring Boot
- Spring Security
- JWT Authentication
- Spring Data JPA
- Hibernate ORM
- RESTful Web Services
- Microservices Architecture
- Maven Build Management
- Unit Testing using JUnit 5
- Mockito Framework
- SLF4J Logging
- Git & GitHub Version Control
- Visual Studio Code Development

---

# Author

**Keerthika Murugan**

**Java Full Stack Engineering (FSE) – Digital Nurture Program**
