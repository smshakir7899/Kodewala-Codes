package com.zepto.order.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.zepto.order.entity.OrderEntity;

@Repository
public interface OrderRepository extends CrudRepository<OrderEntity, Integer>
{

//	@Query("select o from orders o where o.paymentMethod=:type and o.quantity <3") // This is JPQL
	@Query(value = "select * from orders where payment_method='UPI' and quantity<3", nativeQuery = true) // this is SQL
	public List<OrderEntity> findOrderByPaymentType(@Param("type") String paymentType);
}
