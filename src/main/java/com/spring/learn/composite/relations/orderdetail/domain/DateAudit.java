package com.spring.learn.composite.relations.orderdetail.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.util.Date;


@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class DateAudit implements Serializable {


    @CreatedDate
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss")
    Date createdAt;

    public DateAudit(Date createdAt) {
        this.createdAt = createdAt;
    }

    public DateAudit() {
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}