package com.spring.learn.composite.relations.orderdetail.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.xml.crypto.Data;
import java.util.Date;

public record OrderDetailDto(
        Integer orderId,
        String customerName,
        String productName,
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Europe/Istanbul") Date createdAt) {
}
