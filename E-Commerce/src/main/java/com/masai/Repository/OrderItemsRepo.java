package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.Entity.OrderItem;

public interface OrderItemsRepo extends JpaRepository<OrderItem, Integer> {

}
