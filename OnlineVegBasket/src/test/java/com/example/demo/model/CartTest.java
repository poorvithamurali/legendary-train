package com.example.demo.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class CartTest {
	@Test
	public void testcust()
	{
		
		Cart m=new Cart();
		m.setId(6);
		m.setVegname("Brinjal");
		m.setQuantity(3);
		m.setOriginalprice(50);
		assertEquals(6,m.getId());
		assertEquals("Brinjal",m.getVegname());
		assertEquals(3,m.getQuantity());
		assertEquals(50,m.getOriginalprice());
	}
	@Test
	public void cartconstructor()
	{
		Cart m=new Cart(7,"Onion",5,200);
		assertEquals(7,m.getId());
		assertEquals("Onion",m.getVegname());
		assertEquals(5,m.getQuantity());
		assertEquals(200,m.getOriginalprice());
	
	}
	public void carttostring()
	{
		Cart m=new Cart(7,"Onion",5,200);
		assertEquals( "Cart [id=" + 7 + ", vegname=" + "Onion" + ", quantity=" + 5 + ", originalprice=" + 200
				+ "]",m.toString());
	
	}
	
}

