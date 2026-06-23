package payment_service.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import payment_service.dto.PaymentRequest;
import payment_service.service.PaymentService;

@Slf4j
@RestController
@RequestMapping("/api/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping
    public String transfer(
            @Valid
            @RequestBody PaymentRequest request) {

        log.info("Received payment request");

        return paymentService.transferMoney(request);
    }
}