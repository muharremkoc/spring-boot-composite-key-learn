package com.spring.learn.composite.simple.book.service;

import com.spring.learn.composite.simple.book.model.BookRequestDto;
import com.spring.learn.composite.simple.book.model.BookResponseDto;

import java.util.List;

public interface BookService {
    BookResponseDto createBook(BookRequestDto bookRequestDto);
    List<BookResponseDto> getAllBooks();
}
