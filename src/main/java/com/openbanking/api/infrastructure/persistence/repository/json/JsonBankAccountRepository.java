package com.openbanking.api.infrastructure.persistence.repository.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.openbanking.api.domain.model.BankingAccount;
import com.openbanking.api.domain.model.Customer;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class JsonBankAccountRepository {
    private final String JSON_FILE_PATH = "src/main/resources/private/bank-account-default.json";
    public List<BankingAccount> getTransactions() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            File jsonFile = new File(JSON_FILE_PATH);

            return Arrays.asList(objectMapper.readValue(jsonFile, BankingAccount[].class));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
