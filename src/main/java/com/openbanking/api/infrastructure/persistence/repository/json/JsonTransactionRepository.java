package com.openbanking.api.infrastructure.persistence.repository.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.openbanking.api.domain.model.Transaction;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class JsonTransactionRepository {
    private final String JSON_FILE_PATH = "src/main/resources/private/transaction-default.json";
    public List<Transaction> getTransactions() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            File jsonFile = new File(JSON_FILE_PATH);

            return Arrays.asList(objectMapper.readValue(jsonFile, Transaction[].class));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
