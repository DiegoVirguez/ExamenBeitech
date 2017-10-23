package com.beitech.orders.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class OrdenDetailService {

	public int suematoriaPrecios(List<Integer> productos){
		int resultado=0;
		for(Integer i : productos){
			resultado = resultado + resultado;
		}
		return resultado;
	}
	
}
