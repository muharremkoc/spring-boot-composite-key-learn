package com.spring.learn.composite.simple.book.domain;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class Book {

    @EmbeddedId
    private BookID id;

    private String bookName;

    public BookID getId() {
        return id;
    }

    public void setId(BookID id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
