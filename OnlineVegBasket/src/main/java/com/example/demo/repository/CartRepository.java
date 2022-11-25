package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {
	@Query("select sum(originalprice) from Cart c")
	public double totalprice();
	

}
