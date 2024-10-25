package com.spring.learn.composite.simple.book.controller;

import com.spring.learn.composite.simple.book.model.BookRequestDto;
import com.spring.learn.composite.simple.book.model.BookResponseDto;
import com.spring.learn.composite.simple.book.service.BookService;
import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Hidden
@RestController
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public BookResponseDto createBook(@RequestBody BookRequestDto bookRequestDto) {
        return bookService.createBook(bookRequestDto);
    }

    @GetMapping
    public List<BookResponseDto> getBooks() {
        return bookService.getAllBooks();
    }
}
