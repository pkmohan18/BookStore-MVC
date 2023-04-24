package com.bookStore.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.bookStore.entity.myBookList;
import com.bookStore.bookStore.repository.myBookRepository;

@Service
public class myBookListService {
	
	@Autowired
	private myBookRepository myrepo;
	
	public void saveMyBooks(myBookList book) {
		myrepo.save(book);
	}
	
	public List<myBookList> getAllMyBooks(){
		return myrepo.findAll();
	}
	
	public void deleteById(int id) {
		myrepo.deleteById(id);
	}

}
