package com.beitech.orders.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beitech.orders.model.OrderDetail;;

public interface DetalleOrdenJpaRepository extends JpaRepository<OrderDetail, Long>{
	
	OrderDetail findByorderDetailId(Long orderDetailId);

}
