package com.ctz.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ctz.entity.Book;

public interface BookRepo extends JpaRepository<Book,Integer> {
	
}
