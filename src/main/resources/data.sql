INSERT INTO Customer (name, email) VALUES ('Diego Virguez', 'diego.virguez@example.com');
INSERT INTO Product (name, price) VALUES ('Product Name', 100.0);

SET @customerId = (SELECT customer_id FROM Customer WHERE email = 'diego.virguez@example.com');
SET @productId = (SELECT product_id FROM Product WHERE name = 'Product Name');

INSERT INTO customer_product (customer_id, product_id) VALUES (@customerId, @productId);