package com.example.demo.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VegDTOTest {
	@Test
	public void admintest()
	{
		VegDTO v=new VegDTO();
		v.setVegid(11);
		v.setVegname("Bitterguard");
		v.setAvailable(30);
		v.setOfferprice(50);
		v.setOriginalprice(70);
		v.setOfferpercent("10%");
		v.setVegdesc("fresh");
		assertEquals(11,v.getVegid());
		assertEquals("Bitterguard",v.getVegname());
		assertEquals(30,v.getAvailable());
		assertEquals(50,v.getOfferprice());
		assertEquals(70,v.getOriginalprice());
		assertEquals("10%",v.getOfferpercent());
		assertEquals("fresh",v.getVegdesc());
	} 
	@Test
	public void vegconstructor()
	{
		VegDTO v=new VegDTO(15,"Onion",30,50,60,"5%","fresh");
		assertEquals(15,v.getVegid());
		assertEquals("Onion",v.getVegname());
		assertEquals(30,v.getAvailable());
		assertEquals(50,v.getOfferprice());
		assertEquals(60,v.getOriginalprice());
		assertEquals("5%",v.getOfferpercent());
		assertEquals("fresh",v.getVegdesc());	
		
	}
	@Test
	public void vegdtotostring()
	{
		VegDTO v=new VegDTO(15,"Onion",30,50,60,"5%","fresh");
		assertEquals("Vegetable [vegid=" + 15 + ", vegname=" + "Onion" + ", available=" + 30 + ", offerprice="
				+ 50 + ", originalprice=" + 60 + ", offerpercent=" + "5%" + ", vegdesc="
				+ "fresh" + "]",v.toString());
		
	}
}