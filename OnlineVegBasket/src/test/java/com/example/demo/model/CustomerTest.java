package com.example.demo.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerTest {
	@Test
	public void testcust()
	{
		
		Customer c=new Customer();
		c.setId(17);
		c.setName("Priya");
		c.setAge(23);
		c.setMobile("9999999999");
		c.setEmail("priya@gmail");
		c.setPassword("priya");
		c.setAddress("coimbatore");
		assertEquals(17,c.getId());
		assertEquals("Priya",c.getName());
		assertEquals(23,c.getAge());
		assertEquals("9999999999",c.getMobile());
		assertEquals("priya@gmail",c.getEmail());
		assertEquals("priya",c.getPassword());
		assertEquals("coimbatore",c.getAddress());
		
	}	 
	@Test
	public void custconstructor()
	{
		Customer c=new Customer(19,"miru",24,"9876543217","mi@gmail","miru","cbe");
		assertEquals(19,c.getId());
		assertEquals("miru",c.getName());
		assertEquals(24,c.getAge());
		assertEquals("9876543217",c.getMobile());
		assertEquals("mi@gmail",c.getEmail());
		assertEquals("miru",c.getPassword());
		assertEquals("cbe",c.getAddress());
	}
	@Test
	public void custtostring()
	{
		Customer c=new Customer(19,"miru",24,"9876543217","mi@gmail","miru","cbe");
		assertEquals("Customer [id=" + 19 + ", name=" + "miru" + ", age=" + 24 + ", mobile=" + "9876543217" + ", email=" + "mi@email"
				+ ", password=" + "miru" + ", address=" + "cbe" + "]",c.toString());
	}

}
