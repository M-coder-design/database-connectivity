package org.example;

import org.example.config.HibernateUtil;
import org.example.model.Customer;
import org.example.model.Order;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        // Create Customer and Orders
        session.beginTransaction();
        Customer customer = new Customer();
        customer.setName("John Doe");
        customer.setEmail("john.doe@example.com");

        Order order1 = new Order();
        order1.setProductName("Laptop");
        order1.setAmount(1200.00);

        Order order2 = new Order();
        order2.setProductName("Smartphone");
        order2.setAmount(800.00);

        customer.addOrder(order1);
        customer.addOrder(order2);

        session.save(customer);
        session.getTransaction().commit();

        // Fetch Customer with Orders
        Customer fetchedCustomer = session.get(Customer.class, customer.getId());
        System.out.println("Customer: " + fetchedCustomer.getName());
        fetchedCustomer.getOrders().forEach(order ->
                System.out.println("Order: " + order.getProductName() + " - $" + order.getAmount())
        );

        session.close();
    }
}