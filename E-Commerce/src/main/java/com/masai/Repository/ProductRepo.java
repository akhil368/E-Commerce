package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
