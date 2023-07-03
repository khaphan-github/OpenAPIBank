package com.openbanking.api.interfaces.restfull.controller;

import com.openbanking.api.interfaces.restfull.shared.ResponseBase;
import com.openbanking.api.interfaces.restfull.shared.Variable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 */
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
    public ResponseEntity<ResponseBase<String>> getTransferHistory() {
        ResponseBase<String> response = new ResponseBase<>(200, "Success", "publicKey");
        return ResponseEntity.ok(response);
    }

    @PostMapping("/transfer")
    public ResponseEntity<ResponseBase<String>> transfer() {
        ResponseBase<String> response = new ResponseBase<>(200, "Success", "publicKey");
        return ResponseEntity.ok(response);
    }
}
