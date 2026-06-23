package payment_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import payment_service.entity.Account;

import java.util.Optional;

public interface AccountRepository
        extends JpaRepository<Account, Long> {

    Optional<Account>
    findByAccountNumber(
            String accountNumber);
}