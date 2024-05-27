package com.beitech.orders.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/detallenOrden")
public class OrderDetailController {

/*	@Autowired
	 private DetalleOrdenJpaRepository detalleOrdenJpaRepository;

	@GetMapping(value = "/allOrderDetail")
	 public List<OrderDetail> findAll(){
		 return detalleOrdenJpaRepository.findAll(); 
	 }
	
	@PostMapping(value = "/loadOrderDetail")
	public OrderDetail load(@RequestBody final OrderDetail orderDetail){
		detalleOrdenJpaRepository.save(orderDetail);
		return detalleOrdenJpaRepository.findByorderDetailId(orderDetail.getOrderDetailId());
	}
	*/
}
