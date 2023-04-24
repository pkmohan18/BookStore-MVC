package com.bookStore.bookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookStore.bookStore.entity.myBookList;

@Repository
public interface myBookRepository extends JpaRepository<myBookList, Integer> {

}
