package com.beitech.orders.model;

import javax.persistence.*;

@Entity
@Table(name = "customer_product")
public class CustomerProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;

    // Aquí puedes agregar más campos que representen las restricciones
    // o reglas de negocio que quieras implementar.
}
