package com.api.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.entities.Book;

@Component
public class BookService {
	private static List<Book> list = new ArrayList<>();
	static {
		list.add(new Book(12, "Spring Rest Api", "Abhishek Tiwari"));
		list.add(new Book(14, "Java Api", "Ankit Tiwari"));
		list.add(new Book(13, " Api", "Prince Tiwari"));

	}

//Get all book
	public List<Book> getAllBooks() {
		return list;
	}

//Get Book by Id
	public Book getBookById(int id) {
		Book book = null;
		  book = list.stream().filter(e -> e.getId() == id).findFirst().get();
		return book;
	}

}