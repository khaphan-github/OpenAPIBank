package com.openbanking.api.infrastructure.persistence.entities;

import com.openbanking.api.domain.model.TransactionType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "transaction")
public class TransactionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String accountId;
    private BigDecimal amount;
    @Enumerated(EnumType.STRING)
    private TransactionType type;

    private LocalDateTime transactionDateTime = LocalDateTime.now();

    @ManyToOne
    private BankAccountEntity bankAccountEntity;
}