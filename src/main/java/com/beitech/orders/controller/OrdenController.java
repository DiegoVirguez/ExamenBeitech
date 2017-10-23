package com.beitech.orders.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.beitech.orders.model.*;
import com.beitech.orders.respository.OrdenJpaRepository;

@RestController
@RequestMapping("/ordenes")
public class OrdenController {

	@Autowired
	 private OrdenJpaRepository ordenJpaRepository;

	@GetMapping(value = "/allOrden")
	 public List<Orden> findAll(){
		 return ordenJpaRepository.findAll(); 
	 }
	
	@GetMapping(value = "/{ordenId}")
	 public Orden getById(@PathVariable final Long ordenId){
		 return ordenJpaRepository.findByordenId(ordenId); 
	 }
	
	@PostMapping(value = "/loadOrden")
	public Orden load(@RequestBody final Orden orden){
		ordenJpaRepository.save(orden);
		return ordenJpaRepository.findByordenId(orden.getOrdenId());
	}
	
}
