package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Review {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int reviewid;
	String name;
	String review;
	int rating;
	public Review(int reviewid, String name, String review, int rating) {
		super();
		this.reviewid = reviewid;
		this.name = name;
		this.review = review;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Review [reviewid=" + reviewid + ", name=" + name + ", review=" + review + ", rating=" + rating + "]";
	}
	public Review() {
		super();
		
	}
	public int getReviewid() {
		return reviewid;
	}
	public void setReviewid(int reviewid) {
		this.reviewid = reviewid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

}
