# Task Manager API

A backend REST API that lets you manage your daily tasks — built with Java and Spring Boot, connected to a MySQL database.

## About the Project

I built this project to practice backend development using Spring Boot. It covers the full CRUD cycle — creating, reading, updating, and deleting tasks — with proper error handling and input validation.

No frontend yet, but all endpoints are tested and working via Postman.

## Tech Stack

- Java 17
- Spring Boot 3.3
- Spring Data JPA
- MySQL (via XAMPP)
- Maven
- Postman

## Getting Started

**Prerequisites**

- Java 17 installed
- XAMPP running with MySQL started
- A database named taskdb created in phpMyAdmin

**Run the project**

mvnw spring-boot:run

App runs at http://localhost:8080

## API Endpoints

| Method | Endpoint    | What it does            |
| ------ | ----------- | ----------------------- |
| GET    | /tasks      | Fetch all tasks         |
| GET    | /tasks/{id} | Fetch a single task     |
| POST   | /tasks      | Create a new task       |
| PUT    | /tasks/{id} | Update an existing task |
| DELETE | /tasks/{id} | Delete a task           |

## What I Learned

- How to build REST APIs using Spring Boot
- Connecting a Java application to a MySQL database
- Using Spring Data JPA to handle database operations without writing SQL
- Adding global error handling and input validation
- Testing APIs using Postman

## Author

Nikitha shetty
