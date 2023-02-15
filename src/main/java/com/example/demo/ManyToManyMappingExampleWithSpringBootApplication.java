package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Post;
import com.example.demo.model.Tag;
import com.example.demo.repository.PostRepository;

@SpringBootApplication
public class ManyToManyMappingExampleWithSpringBootApplication implements CommandLineRunner  {

	public static void main(String[] args) {
		SpringApplication.run(ManyToManyMappingExampleWithSpringBootApplication.class, args);
	}
	
	@Autowired
	private PostRepository postRepository ;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Post post = new Post("Hibernate Many to Many Mapping Example with Spring Boot", 
				"Hibernate Many to Many Mapping Example with Spring Boot", 
				"Hibernate Many to Many Mapping Example with Spring Boot");
		
		
		
		
		
		 Post post1 = new Post("Hibernate One to Many Mapping Example with Spring Boot", 
					"Hibernate One to Many Mapping Example with Spring Boot", 
					"Hibernate One to Many Mapping Example with Spring Boot");
			    
			    
			    
				    Tag springBoot = new Tag("Spring Boot");
					Tag hibernate = new Tag("Hibernate");
				
				
					  post.getTags().add(springBoot);
					   post.getTags().add(hibernate);
					   
					   springBoot.getPosts().add(post);
					   hibernate.getPosts().add(post);
				   
				   
				     this.postRepository.save(post);
				   
				   
	   
	   
	   
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
		
	   }
	
	
	
	   
		
		
		
		           
		

		
		
	

}


