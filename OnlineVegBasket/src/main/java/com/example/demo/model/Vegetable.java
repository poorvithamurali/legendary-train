package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vegetable {
	@Id
	int vegid;
	String vegname;
	int available;
	double offerprice;
	double originalprice;
	String offerpercent;
	String vegdesc;
	public Vegetable(int vegid, String vegname, int available, double offerprice, double originalprice,
			String offerpercent, String vegdesc) {
		super();
		this.vegid = vegid;
		this.vegname = vegname;
		this.available = available;
		this.offerprice = offerprice;
		this.originalprice = originalprice;
		this.offerpercent = offerpercent;
		this.vegdesc = vegdesc;
	}
	public Vegetable() {
		super();
		
	}
	@Override
	public String toString() {
		return "Vegetable [vegid=" + vegid + ", vegname=" + vegname + ", available=" + available + ", offerprice="
				+ offerprice + ", originalprice=" + originalprice + ", offerpercent=" + offerpercent + ", vegdesc="
				+ vegdesc + "]";
	}
	public int getVegid() {
		return vegid;
	}
	public void setVegid(int vegid) {
		this.vegid = vegid;
	}
	public String getVegname() {
		return vegname;
	}
	public void setVegname(String vegname) {
		this.vegname = vegname;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
	public double getOfferprice() {
		return offerprice;
	}
	public void setOfferprice(double offerprice) {
		this.offerprice = offerprice;
	}
	public double getOriginalprice() {
		return originalprice;
	}
	public void setOriginalprice(double originalprice) {
		this.originalprice = originalprice;
	}
	public String getOfferpercent() {
		return offerpercent;
	}
	public void setOfferpercent(String offerpercent) {
		this.offerpercent = offerpercent;
	}
	public String getVegdesc() {
		return vegdesc;
	}
	public void setVegdesc(String vegdesc) {
		this.vegdesc = vegdesc;
	}
	
	

}
