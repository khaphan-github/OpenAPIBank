package com.openbanking.api.application.restfull.controller;

import com.openbanking.api.application.restfull.dto.TransferRequest;
import com.openbanking.api.application.restfull.shared.ResponseBase;
import com.openbanking.api.application.restfull.shared.Variable;
import com.openbanking.api.domain.model.Transaction;
import com.openbanking.api.infrastructure.persistence.repository.json.JsonTransactionRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping((Variable.API_GLOBAL_PREFIX))
public class OpenBankingController {
    @GetMapping("/public-key")
    public ResponseEntity<ResponseBase<String>> getPublicKey() {
        String publicKey = "YOUR_PUBLIC_KEY"; // Replace with your actual public key

        ResponseBase<String> response = new ResponseBase<>(200, "Success", publicKey);

        return ResponseEntity.ok(response);
    }

    @PostMapping("/auth")
    public ResponseEntity<ResponseBase<String>> authenticate() {
        ResponseBase<String> response = new ResponseBase<>(200, "Success", "publicKey");
        return ResponseEntity.ok(response);
    }

    @GetMapping("/transfer-history")
    public ResponseEntity<ResponseBase<List<Transaction>>> getTransferHistory() {
        JsonTransactionRepository jsonTransactionRepository = new JsonTransactionRepository();
        ResponseBase<List<Transaction>> response = new ResponseBase<>(200, "Success", jsonTransactionRepository.getTransactions());
        return ResponseEntity.ok(response);
    }

    @PostMapping("/transfer")
    public ResponseEntity<ResponseBase<String>> transfer(@RequestBody()TransferRequest request) {

        ResponseBase<String> response = new ResponseBase<>(200, "Success", "publicKey");
        return ResponseEntity.ok(response);
    }
}
