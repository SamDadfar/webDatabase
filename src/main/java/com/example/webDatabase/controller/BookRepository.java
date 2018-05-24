package com.example.webDatabase.controller;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.webDatabase.domain.*;
@Component
public interface BookRepository extends CrudRepository<Book,Long> {
	//public Book findByBookNameIgnoreCase(String bookName);
}
