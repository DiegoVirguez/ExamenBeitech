package com.beitech.orders.model;

import javax.persistence.*;

@Entity
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderDetailId;
    private String productDescription;
    private Double price;

    /*
    * @ManyToOne: Define la relación muchos a uno con la entidad Orden.
      @JoinColumn(name = "orden_id"): Especifica la columna en la tabla OrdenDetail que se utiliza como clave foránea
      * para la relación con Orden.
    * */
    @ManyToOne
    @JoinColumn(name = "orderId")
    private Order order;

    public Long getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(Long orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
