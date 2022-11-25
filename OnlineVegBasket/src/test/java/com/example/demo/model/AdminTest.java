package com.example.demo.model;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminTest { 
	@Test
	public void admintest()
	{
		Admin a=new Admin();
		a.setId(5);
		a.setName("Admin5");
		a.setMobile("8765432123");
		a.setEmail("ad5@gmail.com");
		a.setPassword("ad05");
		assertEquals(5,a.getId());
		assertEquals("Admin5",a.getName());
		assertEquals("8765432123",a.getMobile());
		assertEquals("ad5@gmail.com",a.getEmail());
		assertEquals("ad05",a.getPassword());
		
	}
	@Test
	public void admintestcon()
	{
		Admin a=new Admin(8,"Admin6","9999976543","ad6@gmail.com","ad06");
		assertEquals(8,a.getId());
		assertEquals("Admin6",a.getName());
		assertEquals("9999976543",a.getMobile());
		assertEquals("ad6@gmail.com",a.getEmail());
		assertEquals("ad06",a.getPassword());
		
	}
	@Test
	public void admintostring()
	{
		Admin a=new Admin(8,"Admin6","9999976543","ad6@gmail.com","ad06");
		assertEquals( "Admin [id=" + 8 + ", name=" + "Admin6" + ", mobile=" + "9999976543" + ", email=" + "ad6@gmail.com" + ", password="
				+ "ad06" + "]",a.toString());
	}
	
	

}
