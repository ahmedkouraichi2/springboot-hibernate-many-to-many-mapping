package com.example.demo.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="Tags")
public class Tag{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long id ;
	private String name ;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "tags")
	private Set<Post> posts = new HashSet<>();
			
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Post> getPosts() {
		return posts;
	}
	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}
	public Tag() {
		
	}
	
	public Tag(long id, String name, Set<Post> posts) {
		super();
		this.id = id;
		this.name = name;
		this.posts = posts;
	}
	
	public Tag(String name) {
		super();
		this.name = name;
	
	}
	
	
	
	
	
	
	
	
	
		
	

}
