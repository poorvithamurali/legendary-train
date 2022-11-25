package com.example.demo.service;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.model.VegDTO;
import com.example.demo.model.Vegetable;
@SpringBootTest
public class VegserviceTest {
	@Autowired
	VegService vs;
	@Test
	void testGetAllVeg()
	{
		List<Vegetable> actual = vs.getveg();
		assertNotNull(actual);
	}
	@Test
	void testSaveOrUpdateveg()
	{
		VegDTO v= new VegDTO();
		v.setVegid(11);
		v.setVegname("Bitterguard");
		v.setAvailable(30);
		v.setOfferprice(50);
		v.setOriginalprice(70);
		v.setOfferpercent("10%");
		v.setVegdesc("fresh");
		vs.saveorupdate(v); 
		assertNotNull(v);	
	}
}
