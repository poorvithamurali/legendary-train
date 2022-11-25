package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String vegname;
	int quantity;
	double originalprice;
	public Cart() {
		super();
		
	} 
	public Cart(int id, String vegname, int quantity, double originalprice) {
		super();
		this.id = id;
		this.vegname = vegname;
		this.quantity = quantity;
		this.originalprice = originalprice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVegname() {
		return vegname;
	}
	public void setVegname(String vegname) {
		this.vegname = vegname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getOriginalprice() {
		return originalprice;
	}
	public void setOriginalprice(double originalprice) {
		this.originalprice = originalprice;
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", vegname=" + vegname + ", quantity=" + quantity + ", originalprice=" + originalprice
				+ "]";
	}
	

}
