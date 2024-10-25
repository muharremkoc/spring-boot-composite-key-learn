package com.spring.learn.composite.simple.book.repository;

import com.spring.learn.composite.simple.book.domain.Book;
import com.spring.learn.composite.simple.book.domain.BookID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, BookID> {
}
