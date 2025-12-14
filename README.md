# Advanced-Java

# Spring MVC Login Validation Application

This repository contains a **basic Spring MVC web application** that demonstrates a **login workflow** using MVC architecture. The project focuses on understanding **controller handling, model usage, request mapping, and view navigation**.

---

## 📌 Project Overview

The application provides a simple login page where a user enters credentials. These credentials are validated on the server side, and based on the result, the user is navigated to either a success page or a failure page.

This project is mainly useful for:

* Beginners learning Spring MVC
* Academic and lab projects
* Interview preparation for MVC concepts

---

## 🛠 Technologies Used

* Java (JDK 8 or higher)
* Spring MVC Framework
* JSP (Java Server Pages)
* Apache Tomcat Server
* Maven (optional but recommended)

---

## 📂 Logical Project Structure

* **Controller Layer**

  * Handles incoming HTTP requests
  * Decides which view to return

* **Model Layer**

  * Represents user data
  * Contains validation logic

* **View Layer (JSP)**

  * Displays login form
  * Shows success or failure messages

---

## 🔁 Control Flow of the Application

1. The user opens the browser and accesses the login URL.
2. The controller handles the request and displays the login page.
3. The user enters username and password and submits the form.
4. The form data is sent to the server using a POST request.
5. The controller receives the request parameters.
6. A User object is created using the entered credentials.
7. Validation logic checks whether the credentials are correct.
8. Based on validation result:

   * If valid → success page is shown
   * If invalid → failure page is shown

---

## 🔐 Login Validation Logic (Conceptual)

* The application checks user credentials against predefined values.
* If both username and password match, login is successful.
* Otherwise, login fails.

> Note: This project does not use a database. Validation is hard-coded for learning purposes.

---

## 🚀 How to Execute / Run the Project

1. Clone or download the project from GitHub.
2. Open Eclipse or IntelliJ IDEA.
3. Import the project as an **Existing Maven Project** (or Dynamic Web Project).
4. Configure **Apache Tomcat** in the IDE.
5. Deploy the project on the Tomcat server.
6. Start the server.
7. Open a web browser and enter:

```
http://localhost:8080/login
```

8. Enter login credentials and submit the form.
9. Observe navigation to success or failure page.

---

## 📌 Important Concepts Demonstrated

* Spring MVC architecture
* @Controller usage
* @GetMapping and @PostMapping
* Request parameter handling
* Separation of concerns (MVC)
* View resolution using JSP

---

## 📈 Possible Enhancements

* Connect to MySQL database
* Use Spring Boot
* Add Spring Security
* Implement form validation annotations
* Improve UI using CSS/Bootstrap

---


-----------------------------------------------
# Spring REST Movie API

This project is a **simple Spring RESTful web service** that exposes a REST API to fetch a list of movies. It demonstrates **layered architecture (Controller → Service → Repository)** and how Spring converts Java objects into **JSON responses** automatically.

---

## 📌 Project Overview

The application provides a REST endpoint that returns a collection of movies. The data is currently stored in memory (hard-coded) and is meant for **learning and demonstration purposes**.

This project is useful for:

* Understanding Spring REST basics
* Learning REST controller flow
* Academic and lab submissions
* Interview preparation for REST APIs

---

## 🛠 Technologies Used

* Java (JDK 8+)
* Spring Framework (Spring REST)
* Maven
* Apache Tomcat (or embedded server)
* JSON (response format)

---

## 🧱 Application Architecture

The project follows a **layered architecture**:

1. **Controller Layer**

   * Handles HTTP requests
   * Exposes REST endpoints

2. **Service Layer**

   * Contains business logic
   * Acts as a bridge between controller and repository

3. **Repository Layer**

   * Fetches data from data source

4. **Store / Data Source Layer**

   * Holds in-memory movie data

5. **Entity Layer**

   * Represents movie data structure

---

## 🔁 Control Flow of the Application

1. Client sends an HTTP **GET request** to the movies endpoint.
2. The **REST Controller** receives the request.
3. Controller delegates the request to the **Service layer**.
4. Service layer calls the **Repository layer**.
5. Repository fetches data from the **Movie Catalog (in-memory store)**.
6. A list of Movie objects is returned back through the layers.
7. Spring automatically converts the list into **JSON format**.
8. Client receives the JSON response.

---

## 🌐 REST Endpoint Details

| HTTP Method | Endpoint | Description      |
| ----------- | -------- | ---------------- |
| GET         | /movies  | Fetch all movies |

---

## 📄 Sample JSON Response

```json
[
  {
    "movieId": 101,
    "name": "Sholay",
    "genr": "Action",
    "release": "2022-10-20"
  },
  {
    "movieId": 102,
    "name": "PK",
    "genr": "Comedy",
    "release": "2024-11-25"
  }
]
```

---

## 🚀 How to Execute / Run the Project

1. Clone or download the project from GitHub.
2. Open Eclipse or IntelliJ IDEA.
3. Import the project as a **Maven Project**.
4. Ensure all dependencies are downloaded.
5. Configure **Apache Tomcat** (if not using embedded server).
6. Run the application.
7. Open browser or Postman and access:

```
http://localhost:8080/movies
```

8. The response will be displayed in JSON format.

---

## 📌 Key Concepts Demonstrated

* RESTful web services
* @RestController usage
* @GetMapping
* Dependency Injection using @Autowired
* Layered architecture
* JSON serialization
* Separation of concerns


--------------------------------------------------------------

-------------------------------------------------------------

# Spring REST API with JPA – Department & Employee Management

This project is a **Spring RESTful web service** built using **Spring Data JPA**. It provides REST APIs to manage **Departments and Employees**, including CRUD operations and linking employees to departments. The application demonstrates **real-world layered architecture** commonly used in enterprise applications.

---

## 📌 Project Overview

The application exposes REST endpoints to:

* Create, retrieve, and delete departments
* Create, retrieve, and delete employees
* Associate employees with departments

Data persistence is handled using **Spring Data JPA**, and the application follows a clean separation of concerns.

This project is suitable for:

* Academic / mini projects
* Understanding Spring REST + JPA integration
* Backend interview preparation

---

## 🛠 Technologies Used

* Java (JDK 8+)
* Spring REST
* Spring Data JPA
* Hibernate
* Maven
* MySQL / H2 (any JPA-supported database)
* Apache Tomcat or Embedded Server
* JSON (request & response format)

---

## 🧱 Application Architecture

The project follows a **layered architecture**:

1. **Controller Layer**

   * Exposes REST endpoints
   * Handles HTTP requests (GET, POST, PUT, DELETE)

2. **Service Layer**

   * Contains business logic
   * Coordinates between controllers and repositories

3. **Repository Layer**

   * Extends Spring Data JPA repositories
   * Handles database operations

4. **Entity Layer**

   * Represents database tables
   * Manages relationships between Department and Employee

---

## 🔁 Control Flow of the Application

### Department Operations

1. Client sends a request to the department endpoint.
2. REST controller receives the request.
3. Controller delegates the request to the service layer.
4. Service layer interacts with the JPA repository.
5. Repository performs database operations.
6. Response is sent back to the client in JSON format.

### Employee Operations

1. Client sends a request to the employee endpoint.
2. Controller forwards the request to the employee service.
3. Service uses JPA repository to interact with the database.
4. Requested data is returned as JSON.

### Employee–Department Association

1. Client sends a PUT request with employee ID and department ID.
2. Service fetches both entities from the database.
3. Employee is linked to the department.
4. Updated department is saved.

---

## 🌐 REST API Endpoints

### Department APIs

| HTTP Method | Endpoint              | Description              |
| ----------- | --------------------- | ------------------------ |
| POST        | /departments          | Create a new department  |
| GET         | /departments          | Fetch all departments    |
| GET         | /departments/{deptId} | Fetch a department by ID |
| DELETE      | /departments/{deptId} | Delete a department      |

### Employee APIs

| HTTP Method | Endpoint                    | Description                 |
| ----------- | --------------------------- | --------------------------- |
| POST        | /employees                  | Create a new employee       |
| GET         | /employees                  | Fetch all employees         |
| GET         | /employees/{empId}          | Fetch employee by ID        |
| DELETE      | /employees/{empId}          | Delete employee             |
| PUT         | /employees/{empNo}/{deptNo} | Link employee to department |

---

## 📄 Request & Response Format

* All requests and responses use **JSON format**.
* Spring automatically converts JSON to Java objects and vice versa.

---

## 🚀 How to Execute / Run the Project

1. Clone or download the project from GitHub.
2. Open Eclipse or IntelliJ IDEA.
3. Import the project as a **Maven Project**.
4. Configure database settings in `application.properties`.
5. Ensure database is running.
6. Run the application.
7. Use **Postman** or browser to test APIs.

Base URL:

```
http://localhost:8080
```

[http://localhost:8080](http://localhost:8080)

````

---

## 📤 Sample Output (API Responses)

Below are example outputs returned by the REST APIs in **JSON format**.

### 🔹 Get All Departments

**Request:**  
GET `/departments`

**Response:**
```json
[
  {
    "deptId": 1,
    "deptName": "IT",
    "employees": []
  },
  {
    "deptId": 2,
    "deptName": "HR",
    "employees": []
  }
]
````

---

### 🔹 Get All Employees

**Request

* RESTful web services
* CRUD operations using Spring Data JPA
* Entity relationships
* Dependency Injection
* @RestController and HTTP method mappings
* Path variables and request bodies
* JSON serialization and deserialization

---
# Database Output (One-to-Many Mapping)

## 🗄️ Database Output (Before Linking)

### 📋 DEPARTMENT Table

| dept_id | dept_name |
| ------- | --------- |
| 1       | IT        |
| 2       | HR        |

---

### 📋 EMPLOYEE Table

| emp_id | emp_name | salary | dept_id |
| ------ | -------- | ------ | ------- |
| 101    | John     | 50000  | NULL    |
| 102    | Sara     | 60000  | NULL    |

---

## 🔗 Database Output (After Linking)

**Operation Performed:**

```
PUT /employees/101/1
```

(Employee 101 linked to Department 1)

---

### 📋 DEPARTMENT Table (Unchanged)

| dept_id | dept_name |
| ------- | --------- |
| 1       | IT        |
| 2       | HR        |

---

### 📋 EMPLOYEE Table (Updated)

| emp_id | emp_name | salary | dept_id |
| ------ | -------- | ------ | ------- |
| 101    | John     | 50000  | 1       |
| 102    | Sara     | 60000  | NULL    |

---

## ✅ Key Note

* No separate join table is created
* Foreign key `dept_id` appears in **EMPLOYEE table**
* This confirms a **One-to-Many / Many-to-One JPA mapping**



## 📈 Possible Enhancements

* Add PUT APIs for update operations
* Implement pagination and sorting
* Add exception handling
* Use DTOs for response mapping
* Add Spring Security
* Swagger API documentation

---
# Spring REST API with JPA – Movie Management System

This project is a **Spring RESTful application using Spring Data JPA** that exposes APIs to manage **Movie information**. It demonstrates how REST APIs interact with a database using JPA and follow a clean **layered architecture**.

---

## 📌 Project Overview

The Movie Management System provides REST endpoints to perform **CRUD operations** on movies such as:

* Adding a new movie
* Viewing all movies
* Viewing a movie by ID
* Deleting a movie

The application uses **Spring Data JPA** for persistence and returns data in **JSON format**.

This project is ideal for:

* Learning REST APIs with JPA
* College mini projects
* Backend interview preparation

---

## 🛠 Technologies Used

* Java (JDK 8+)
* Spring REST
* Spring Data JPA
* Hibernate
* Maven
* MySQL / H2 Database
* Apache Tomcat / Embedded Server
* JSON

---

## 🧱 Application Architecture

The project follows a **layered architecture**:

1. **Controller Layer**

   * Exposes REST endpoints
   * Handles HTTP requests

2. **Service Layer**

   * Contains business logic
   * Communicates with repository layer

3. **Repository Layer**

   * Extends JPA repositories
   * Handles database operations

4. **Entity Layer**

   * Represents Movie table in database

---

## 🔁 Control Flow of the Application

1. Client sends an HTTP request to the Movie API.
2. REST Controller receives the request.
3. Controller forwards the request to the Service layer.
4. Service layer interacts with the JPA Repository.
5. Repository performs database operations.
6. Data is returned back through the layers.
7. Spring converts Java objects into **JSON response**.

---

## 🌐 REST API Endpoints

| HTTP Method | Endpoint     | Description        |
| ----------- | ------------ | ------------------ |
| POST        | /movies      | Add a new movie    |
| GET         | /movies      | Fetch all movies   |
| GET         | /movies/{id} | Fetch movie by ID  |
| DELETE      | /movies/{id} | Delete movie by ID |

---

## 📤 Sample Output (API Response)

### 🔹 Get All Movies

```json
[
  {
    "movieId": 101,
    "name": "Sholay",
    "genre": "Action",
    "releaseDate": "2022-10-20"
  },
  {
    "movieId": 102,
    "name": "PK",
    "genre": "Comedy",
    "releaseDate": "2024-11-25"
  }
]
```

---

## 🗄️ Database Output

### 📋 MOVIE Table

| movie_id | name   | genre  | release_date |
| -------- | ------ | ------ | ------------ |
| 101      | Sholay | Action | 2022-10-20   |
| 102      | PK     | Comedy | 2024-11-25   |

---

## 🚀 How to Execute / Run the Project

1. Clone or download the project from GitHub.
2. Open Eclipse or IntelliJ IDEA.
3. Import the project as a **Maven Project**.
4. Configure database properties in `application.properties`.
5. Start the database server.
6. Run the Spring application.
7. Test APIs using **Postman** or browser.

Base URL:

```
http://localhost:8080/movies
```

---

## 📌 Key Concepts Demonstrated

* RESTful Web Services
* CRUD operations using Spring Data JPA
* Dependency Injection
* JSON serialization
* Layered architecture
* Database persistence with Hibernate

---

## 📈 Future Enhancements

* Update movie details (PUT)
* Pagination and sorting
* Exception handling
* Swagger API documentation
* Spring Security

---



