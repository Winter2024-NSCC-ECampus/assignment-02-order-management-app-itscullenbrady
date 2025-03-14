# Order Management System

This project is an Order Management System built with Spring Boot and MySQL. It allows users to view products, register, log in, and place orders. The application ensures product quantity is checked before ordering and stores user details in the database.

## Features

- **View All Products**: Users can view a list of all available products.
- **View Products by Category**: Users can filter products by category.
- **View Detailed Descriptions**: Users can view detailed descriptions, reviews, and ratings of products.
- **User Registration and Login**: Users can register and log in to place orders.
- **Order Placement**: Users can place orders, and the system checks product quantity before confirming the order.
- **User Details Storage**: The system stores user details such as first name, last name, city, etc., in the database.

## Project Structure

```
OrderManagementApp/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── org/
│   │   │       └── example/
│   │   │           └── ordermanagementapp/
│   │   │               ├── controller/
│   │   │               ├── model/
│   │   │               ├── repository/
│   │   │               └── OrderManagementAppApplication.java
│   │   └── resources/
│   │       ├── templates/
│   │       ├── application.properties
│   │       └── MySQLScript.txt
│   └── test/
│       └── java/
│           └── org/
│               └── example/
│                   └── ordermanagementapp/
├── .vscode/
│   └── launch.json
├── pom.xml
└── README.md
```

### Directories and Files

- **model/**: Contains the entity classes.
  - `User.java`: Represents a user in the system.
  - `Product.java`: Represents a product in the system.
  - `Order.java`: Represents an order placed by a user.
  - `OrderItem.java`: Represents an item in an order.

- **repository/**: Interfaces for data access.
  - `UserRepository.java`: Interface for user data access.
  - `ProductRepository.java`: Interface for product data access.
  - `OrderRepository.java`: Interface for order data access.
  - `OrderItemRepository.java`: Interface for order item data access.

- **controller/**: Spring MVC controllers handling user registration, product display, and order placement.
  - `UserController.java`: Handles user registration and login.
  - `ProductController.java`: Handles displaying products and product details.
  - `OrderController.java`: Handles order placement and confirmation.

- **templates/**: Thymeleaf HTML files for views.
  - `login.html`: View for user login.
  - `register.html`: View for user registration.
  - `product-list.html`: View for displaying the list of products.
  - `product-details.html`: View for displaying product details.
  - `order-confirmation.html`: View for order confirmation.

- **OrderManagementAppApplication.java**: Main class to run the Spring Boot application.

- **application.properties**: Configuration file for the Spring Boot application.
  - Contains database connection settings, Hibernate settings, and other configurations.

- **MySQLScript.txt**: SQL script to create the database schema.

- **pom.xml**: Maven configuration file containing project dependencies and build configurations.

- **.vscode/launch.json**: Configuration file for launching the application in Visual Studio Code.

## Getting Started

### Prerequisites

- Java 21
- Maven
- MySQL

### Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/itscullenbrady/OrderManagementApp.git
   cd OrderManagementApp
   ```

2. Set up the MySQL database:

   - Create a database named `order_management_db`.
   - Run the SQL script located in `src/main/resources/MySQLScript.txt` to create the necessary tables.

3. Configure the database connection:

   - Open `src/main/resources/application.properties`.
   - Set your MySQL username and password:
   ```properties
   spring.datasource.username=your_mysql_username
   spring.datasource.password=your_mysql_password
   ```

4. Build and run the application:

   ```sh
   mvn clean install
   mvn spring-boot:run
   ```

5. Access the application:

   - Open your web browser and go to `http://localhost:8080`.

## Usage

1. **Register**: Create a new user account.
2. **Login**: Log in with your credentials.
3. **View Products**: Browse the list of available products.
4. **View Product Details**: Click on a product to view its details, reviews, and ratings.
5. **Place Order**: Add products to your cart and place an order. The system will check the product quantity before confirming the order.

## Dependencies

- Spring Boot
- Spring Data JPA
- Thymeleaf
- MySQL Connector/J
- Lombok

## License

This project is licensed under the MIT License.

## Acknowledgements

- Spring Boot Documentation
- Thymeleaf Documentation
- MySQL Documentation