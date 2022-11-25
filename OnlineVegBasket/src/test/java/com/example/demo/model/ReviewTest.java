package com.example.demo.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReviewTest {
	@Test
	public void reviewcust()
	{
		
		Review r=new Review();
		r.setReviewid(6);
		r.setName("Miru");
		r.setReview("good");
		r.setRating(8);
		assertEquals(6,r.getReviewid());
		assertEquals("Miru",r.getName());
		assertEquals("good",r.getReview());
		assertEquals(8,r.getRating());
		
	}	
	@Test
	public void revconstructor()
	{
		Review r=new Review(7,"Ramya","good",9);
		assertEquals(7,r.getReviewid());
		assertEquals("Ramya",r.getName());
		assertEquals("good",r.getReview());
		assertEquals(9,r.getRating());
	
	}
	@Test
	public void revtostring()
	{
		Review r=new Review(7,"Ramya","good",9);
		assertEquals("Review [reviewid=" + 7 + ", name=" + "Ramya" + ", review=" + "good" + ", rating=" + 9 + "]",r.toString());
		
	}
}
