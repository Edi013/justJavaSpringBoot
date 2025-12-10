package com.rest.RestServices.services;

import com.rest.RestServices.exceptions.AccountNotFoundException;
import com.rest.RestServices.models.Account;
import com.rest.RestServices.repositories.AccountRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;


@Service
public class TransferService {
    private final AccountRepository accountRepository;

    public TransferService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Iterable<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public List<Account> findAccountsByName(String name) {
        return accountRepository.findAccountsByName(name);
    }

    @Transactional
    public void transferMoney(
            long idSender,
            long idReceiver,
            BigDecimal amount) {

        Account sender =
        accountRepository.findById(idSender)
        .orElseThrow(AccountNotFoundException::new);

        Account receiver =
        accountRepository.findById(idReceiver)
                .orElseThrow(() -> new AccountNotFoundException());

        BigDecimal senderNewAmount =
        sender.getAmount().subtract(amount);

        BigDecimal receiverNewAmount =
        receiver.getAmount().add(amount);

        accountRepository
      .changeAmount(idSender, senderNewAmount);

        accountRepository
      .changeAmount(idReceiver, receiverNewAmount);
    }
}
