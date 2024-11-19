# registration-system
Registration Management System
This project is a Registration Management System, developed as part of a Software Developer Intern assessment for INI8 LABS PVT LTD. It is a CRUD (Create, Read, Update, Delete) application using Spring Boot (backend) with JSP (frontend) and MySQL as the database.

Project Structure
The repository is organized as follows:
backend/ - Contains Spring Boot files for backend development.
frontend/ - Contains JSP files and static resources for frontend development.
README.md - Instructions for setting up and running the project.

Technologies Used
Backend: Spring Boot, Spring MVC, Spring Data JPA (Hibernate)
Frontend: JSP, HTML, CSS
Database: MySQL
IDE: Eclipse (or any IDE with Maven support)
Version Control: Git

Prerequisites
To run this project, ensure you have installed:
Java JDK 17 or higher
MySQL (with the MySQL service running)
Eclipse IDE or any IDE with Maven support
Git (for cloning the repository)

Installation and Setup
1. Clone the Repository
Clone the project to your local machine:
bash
git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name

2. Database Configuration
Create the Database: Open MySQL and create a new database:
sql
CREATE DATABASE registration_db;

3.Update Database Properties: In backend/src/main/resources/application.properties, configure the database connection:
properties
spring.datasource.url=jdbc:mysql://localhost:3306/registration_db
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
Replace your_mysql_username and your_mysql_password with your MySQL credentials.

3. Import the Project into Eclipse
Open Eclipse IDE.
Go to File > Open Projects from File System..., navigate to the backend folder, and import the project.
Allow Maven to resolve dependencies.
Running the Application
Running the Backend
Start the Spring Boot Application:
In Eclipse, right-click the backend project.
Select Run As > Spring Boot App.
The backend server will start on http://localhost:8080.
Accessing the Frontend
After starting the backend server, the JSP files in the src/main/webapp folder will be accessible.
Open your browser and navigate to http://localhost:8080 to access the registration form and the list of registered users.
Usage
Access the Application:
Go to http://localhost:8080 to access the registration page.
Available Operations
Create: Fill in the registration form and submit to create a new entry.
Read: View the list of all registered users on the homepage.
Update: Click the Edit button next to an entry to update registration details.
Delete: Click the Delete button next to an entry to remove it.
