package com.masai.Entity;

import java.util.List;

import org.hibernate.annotations.GeneratorType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.criteria.Order;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String userName;
	
	private String password;
	
	@OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
	private Cart cart; 
	
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
	private List<Order> orders;
	
	
}
