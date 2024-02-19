# CloudLink: Empowering Seamless Cloud Vendor Interaction <br>

This repository contains a CRUD (Create, Read, Update, Delete) application for managing cloud vendors using Spring Boot for the backend. <br>

## Features <br>

- **Create:** Add new cloud vendors to the database. <br>
- **Read:** Retrieve details of all cloud vendors or a specific cloud vendor by ID. <br>
- **Update:** Modify existing cloud vendor details. <br>
- **Delete:** Remove a cloud vendor from the database. <br>

## Technologies Used <br>

- **Spring Boot:** Backend framework for handling server logic and database operations. <br>
- **Spring Data JPA:** Provides repository support for interacting with the database. <br>
- **H2 Database:** In-memory database for storing cloud vendor data during development. <br>
- **REST API:** Follows Representational State Transfer principles for interaction between systems. <br>
- **JUnit:** Testing framework for unit and integration testing. <br>
- **Maven:** Dependency management tool for building and managing the project. <br>

## Usage <br>

1. Clone the repository to your local machine. <br>
2. Ensure you have Java and Maven installed. <br>
3. Navigate to the project directory. <br>
4. Run the following command to start the server: <br>
   ```bash 
   mvn spring-boot:run 

5. Access the application through a REST API testing tool or web browser. <br>

## API Endpoints <br>

- **GET /cloudvendor/{vendorId}:** Retrieve details of a specific cloud vendor by ID. <br>
- **GET /cloudvendor:** Retrieve details of all cloud vendors. <br>
- **POST /cloudvendor:** Add a new cloud vendor to the database. <br>
- **PUT /cloudvendor:** Update an existing cloud vendor. <br>
- **DELETE /cloudvendor/{vendorId}:** Delete a cloud vendor from the database. <br>

## Project Structure <br>

- **`src/main/java/com/rest_api_crud/crud/controller`:** Contains the RESTful controller for handling HTTP requests. <br>
- **`src/main/java/com/rest_api_crud/crud/model`:** Defines the data model for the CloudVendor entity. <br>
- **`src/main/java/com/rest_api_crud/crud/repository`:** Contains the repository interface for CRUD operations on the CloudVendor entity. <br>
- **`src/main/java/com/rest_api_crud/crud/service`:** Contains the service interface and its implementation for business logic operations. <br>

## Contributions <br>

Contributions are welcome! Feel free to submit pull requests or open issues for any improvements or feature requests. <br>
