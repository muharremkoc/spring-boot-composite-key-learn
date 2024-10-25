package com.spring.learn.composite.simple.book.service;

import com.spring.learn.composite.simple.book.domain.Book;
import com.spring.learn.composite.simple.book.domain.BookID;
import com.spring.learn.composite.simple.book.model.BookRequestDto;
import com.spring.learn.composite.simple.book.model.BookResponseDto;
import com.spring.learn.composite.simple.book.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public BookResponseDto createBook(BookRequestDto bookRequestDto) {
        Book book = new Book();
        book.setId(new BookID());
        book.setBookName(bookRequestDto.bookName());
        bookRepository.save(book);
        return mapToBookResponseDto(book);
    }

    @Override
    public List<BookResponseDto> getAllBooks() {
        List<Book> books = bookRepository.findAll();
        List<BookResponseDto> bookResponseDtos = new ArrayList<>();
        books.forEach(user -> bookResponseDtos.add(mapToBookResponseDto(user)));

        return bookResponseDtos;
    }

    private BookResponseDto mapToBookResponseDto(Book book) {
        return new BookResponseDto(book.getId().getBookId(), book.getBookName());

    }
}
