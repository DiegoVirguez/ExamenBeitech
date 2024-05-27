package com.beitech.orders.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private String deliveryOrder;
    private LocalDate orderDate;

    /*
    mappedBy = "orden": Indica que el campo order en la entidad OrdenDetail es el propietario de la relación.
    cascade = CascadeType.ALL: Propaga todas las operaciones (persistencia, eliminación, etc.) desde Orden a OrdenDetail.
    orphanRemoval = true: Elimina cualquier OrdenDetail que ya no esté asociado a una Orden.
* */

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<OrderDetail> details;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long order_id) {
        this.orderId = order_id;
    }

    public String getDeliveryOrder() {
        return deliveryOrder;
    }

    public void setDeliveryOrder(String deliveryOrder) {
        this.deliveryOrder = deliveryOrder;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Set<OrderDetail> getDetails() {
        return details;
    }

    public void setDetails(Set<OrderDetail> details) {
        this.details = details;
    }
}
