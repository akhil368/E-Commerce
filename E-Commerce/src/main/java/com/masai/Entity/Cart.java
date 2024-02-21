package com.masai.Entity;

import java.util.List;
import com.masai.Entity.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@OneToOne
	@JoinColumn(name="user_id")
	private User user;
	
	
	@OneToMany(mappedBy = "cart",cascade=CascadeType.ALL)
	private List<CartItem> cartItems;
}
