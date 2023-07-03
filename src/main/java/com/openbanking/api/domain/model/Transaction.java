package com.openbanking.api.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Transaction {
    private Long id;
    private String accountId;
    private BigDecimal amount;
    private Transaction type;
    private LocalDateTime transactionDateTime = LocalDateTime.now();
}
