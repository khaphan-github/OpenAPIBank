package com.openbanking.api.infrastructure.configuration;

import com.openbanking.api.domain.services.DomainTransactionService;
import com.openbanking.api.domain.services.TransactionService;
import com.openbanking.api.infrastructure.persistence.impl.PostgresDBTransactionRepository;
import com.openbanking.api.infrastructure.persistence.repository.json.JsonTransactionRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TransactionConfiguration {
    PostgresDBTransactionRepository transactionRepository;
    @Bean
    public JsonTransactionRepository jsonTransactionRepository() {
        return new JsonTransactionRepository();
    }
    @Bean
    public TransactionService transactionService() {
        return new DomainTransactionService(transactionRepository);
    }
}
