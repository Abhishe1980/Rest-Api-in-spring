package com.api.book.bootrestbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.api.services.BookService;
import com.entities.Book;

@RestController
@Controller
public class BookController{

    @Autowired(required=false)
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getbook(){
    

        return this.bookService.getAllBooks();
    }
    
    @GetMapping("/books/{id}")
    public Book getbooks(@PathVariable("id") int id) {
    	
    	return bookService.getBookById(id);
    	
    }
    
}
