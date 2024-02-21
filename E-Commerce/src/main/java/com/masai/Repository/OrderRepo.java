package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.persistence.criteria.Order;

public interface OrderRepo extends JpaRepository<Order, Integer> {

}
