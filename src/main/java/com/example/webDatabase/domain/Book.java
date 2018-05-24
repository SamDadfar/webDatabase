package com.example.webDatabase.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
	
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	private String authorName;
	private String publisherName;
	private int numPub;
	private int yearOfPub;
	private String status;
	
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
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public int getNumPub() {
		return numPub;
	}
	public void setNumPub(int numPub) {
		this.numPub = numPub;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public int getYearOfPub() {
		return yearOfPub;
	}
	public void setYearOfPub(int yearOfPub) {
		this.yearOfPub = yearOfPub;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
