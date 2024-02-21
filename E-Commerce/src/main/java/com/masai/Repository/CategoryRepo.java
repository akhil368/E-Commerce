package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.Entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
