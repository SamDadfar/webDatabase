package com.example.webDatabase.api;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.webDatabase.controller.BookService;
import com.example.webDatabase.domain.Book;

@Path("book")
@Component
public class BookEndpoint {
@Autowired
private BookService bookService;
@GET
@Produces(MediaType.APPLICATION_JSON)
public Response listBooks() {
	Iterable<Book> bookList=bookService.findAll();
	return Response.ok(bookList).build();
}
@POST
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.TEXT_PLAIN)
public Response postBook(Book book){
	Book result = bookService.save(book);
	return Response.accepted(result.getId()).build();	
}
}
