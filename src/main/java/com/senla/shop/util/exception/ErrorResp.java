package com.senla.shop.util.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Locale;

@Data
@AllArgsConstructor
public class ErrorResp {
    private String msg;
    private LocalDateTime createdAt = LocalDateTime.now();

    public ErrorResp(String msg) {
        this.msg = msg;
    }
}
