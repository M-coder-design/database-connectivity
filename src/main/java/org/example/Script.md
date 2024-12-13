CREATE DATABASE hibernate_relationships;

CREATE TABLE customers (
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(50) NOT NULL,
email VARCHAR(100) NOT NULL
);

CREATE TABLE orders (
id INT AUTO_INCREMENT PRIMARY KEY,
product_name VARCHAR(100) NOT NULL,
amount DECIMAL(10, 2) NOT NULL,
customer_id INT,
FOREIGN KEY (customer_id) REFERENCES customers(id)
);
