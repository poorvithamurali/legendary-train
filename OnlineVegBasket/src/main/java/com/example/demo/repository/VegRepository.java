package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.VegDTO;
import com.example.demo.model.Vegetable;
public interface VegRepository extends JpaRepository<Vegetable,Integer> {
	
	
}
