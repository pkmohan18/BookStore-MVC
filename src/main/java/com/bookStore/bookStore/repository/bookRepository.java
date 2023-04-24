package com.bookStore.bookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookStore.bookStore.entity.Book;

@Repository
public interface bookRepository extends JpaRepository<Book, Integer>{

}
