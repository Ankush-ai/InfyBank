# InfyBank Project

InfyBank is a Spring Boot project that provides APIs and controllers for a banking system. It leverages various technologies and features to ensure a secure and efficient banking experience for customers.

## Features

1. **MySQL Database**: Persistent storage for customer and banking data.
2. **JPA (Java Persistence API)**: Simplifies database operations and object-relational mapping.
3. **Hibernate**: ORM (Object-Relational Mapping) framework for interacting with the MySQL database.
4. **Spring Security**: Ensures the security of the banking system by providing authentication and authorization mechanisms.
5. **Validation**: Input validation to ensure data integrity and prevent erroneous data entry.
6. **Rest Template**: Consumes external APIs or services for seamless integration with other systems.
7. **Exception Handling**: Robust error handling to gracefully manage unexpected situations and provide meaningful feedback.

## Prerequisites

Make sure you have the following installed:

- Java Development Kit (JDK)
- MySQL Database
- Your preferred IDE (Integrated Development Environment)

## Setup

1. Clone the repository:

    ```bash
    git clone https://github.com/your-username/InfyBank.git
    ```

2. Configure MySQL database settings in `application.properties`:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/infybank
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    ```

3. Build and run the project:

    ```bash
    ./mvnw spring-boot:run
    ```

## Usage

- The API documentation can be accessed at: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

- Secure APIs are protected using Spring Security, and authentication is required.

## Contributing

If you would like to contribute to this project, please follow the [contribution guidelines](CONTRIBUTING.md).

## License

This project is licensed under the [MIT License](LICENSE).

## Contact

For inquiries and support, please contact [Your Name] at [your.email@example.com].

