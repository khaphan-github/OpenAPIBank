package com.openbanking.api.domain.services;

import com.openbanking.api.domain.repository.TransactionRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DomainTransactionService implements TransactionService {
    private  final TransactionRepository transactionRepository;
}
