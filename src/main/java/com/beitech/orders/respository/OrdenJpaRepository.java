package com.beitech.orders.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import com.beitech.orders.model.Orden;

@Component
public interface OrdenJpaRepository extends JpaRepository<Orden, Long>{

	Orden findByordenId(Long ordenId);






	
}
