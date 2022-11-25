package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Review;
import com.example.demo.repository.ReviewRepository;
@Service
public class ReviewService {
@Autowired
	
	ReviewRepository revrepository;
    public Review addreview(Review r) {
		
		return revrepository.save(r);
	}
	public  List<Review>  getrev() 
	{
		
		return revrepository.findAll();
	}
	public void delete(int reviewid) {
		revrepository.deleteById(reviewid);
		
	}


}
