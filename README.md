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


