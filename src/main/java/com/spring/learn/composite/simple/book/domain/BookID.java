package com.spring.learn.composite.simple.book.domain;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Embeddable
public class BookID implements Serializable {

    private String bookId;
    private Date date;

    public BookID() {
        this.date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String formattedDate = sdf.format(this.date);

        this.bookId = formattedDate + "-" + UUID.randomUUID().toString();
    }

    public BookID(String bookId, Date date) {
        this.bookId = bookId;
        this.date = date;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
