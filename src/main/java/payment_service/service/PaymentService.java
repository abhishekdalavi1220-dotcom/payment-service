package payment_service.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import payment_service.dto.PaymentRequest;

@Slf4j
@Service
public class PaymentService {

    public String transferMoney(PaymentRequest request) {

        log.info(
                "Transfer request received | Sender={} | Receiver={} | Amount={}",
                request.getSenderAccount(),
                request.getReceiverAccount(),
                request.getAmount()
        );

        return "Payment Successful";
    }
}