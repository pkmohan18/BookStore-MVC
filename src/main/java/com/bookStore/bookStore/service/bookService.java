package com.bookStore.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.bookStore.entity.Book;
import com.bookStore.bookStore.repository.bookRepository;

@Service
public class bookService {
	
	@Autowired
	private bookRepository repo;
	
	public void save(Book b) {
		repo.save(b);
	}
	
	public List<Book> getAllBooks(){
		return repo.findAll();
	}
	
	public Book getBookById(int id) {
		return repo.findById(id).get();
	}
	
	public void deleteById(int id) {
		repo.deleteById(id);
	}


}
