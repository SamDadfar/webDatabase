package com.example.webDatabase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.webDatabase.domain.Book;

@Service
@Transactional
public class BookService {
	@Autowired
private BookRepository bookRepository;

	public Book save(Book book){
		return bookRepository.save(book);
	}
	public Book findById(long id) {
		return bookRepository.findById(id).get();
	}
	public void delete(Book book){
		bookRepository.delete(book);
	}
	
	public Iterable <Book> findAll(){
		Iterable <Book> result = bookRepository.findAll();
		return result;
	}
	/*public Book findByBookNameIgnoreCase(String bookName) {
		return bookRepository.findByBookNameIgnoreCase(bookName);	
	}*/
}