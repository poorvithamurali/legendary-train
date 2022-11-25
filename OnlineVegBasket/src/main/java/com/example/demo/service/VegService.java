package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.VegDTO;
import com.example.demo.model.Vegetable;
import com.example.demo.repository.VegRepository;
@Service
public class VegService {
@Autowired
	
	VegRepository vegrepository;
    public Vegetable adddata(Vegetable v) {
		
		return vegrepository.save(v);
	}
	public  List<Vegetable>  getveg() 
	{
		
		return vegrepository.findAll();
	}
	public void delete(int vegid) {
		vegrepository.deleteById(vegid);
		
	}
public Vegetable getVegById(int vegid) {
		
		Optional<Vegetable> list = vegrepository.findById(vegid);
		Vegetable v=null;
		if(list.isPresent()) {
			v=list.get();
		}
			return v;
	}
public void saveorupdate(VegDTO vd) {
		Vegetable v=new Vegetable();
		v.setVegid(vd.getVegid());
		v.setVegname(vd.getVegname());
		v.setAvailable(vd.getAvailable());
		v.setOfferprice(vd.getOfferprice());
		v.setOriginalprice(vd.getOriginalprice());
		v.setOfferpercent(vd.getOfferpercent());
		v.setVegdesc(vd.getVegdesc());
		vegrepository.save(v);

	}
}
