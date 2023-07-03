package com.openbanking.api.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Transaction {
    private Long id;
    private String accountId;
    private BigDecimal amount;
    private String type;
    private String transferContent;
    private LocalDateTime transactionDateTime = LocalDateTime.now();
}
