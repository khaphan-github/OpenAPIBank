package com.openbanking.api.application.restfull.shared;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseBase<T> {
    private String id;
    private Date timestamp;
    private int status;
    private String message;
    private T data;

    public ResponseBase(int status, String message, T data) {
        this.id = UUID.randomUUID().toString();
        this.timestamp = new Date();
        this.status = status;
        this.message = message;
        this.data = data;
    }
}
