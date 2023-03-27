package com.ctz;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ctz.entity.Book;
import com.ctz.repo.BookRepo;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootFirstApplication.class, args);
		BookRepo repo = context.getBean(BookRepo.class);
		/*
		 * Book b = new Book();

		b.setBookId(1011);

		b.setBookName("Game of throns");
		b.setPrice(1000.0);
		repo.save(b);
		System.out.println("Records are inserted......");
		*/
		Optional<Book> findById = repo.findById(1011);
		System.out.println(findById.get());

	}

}
