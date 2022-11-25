package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Cart;
import com.example.demo.repository.CartRepository;
@Service
public class CartService {
	@Autowired
	CartRepository cr;

	public void saveOrUpdate(Cart c) {
		
		cr.save(c);
	}

	public List<Cart> getCart() {
		return cr.findAll();
		
	}

	public double totalprice() {
		return cr.totalprice();
		
	}

	public void delete(int id) {
		 cr.deleteById(id);
		
	}
}


