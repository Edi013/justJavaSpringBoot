package com.rest.RestServices.services;

import com.rest.RestServices.models.Account;
import com.rest.RestServices.repositories.AccountRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;


import java.math.BigDecimal;
import java.util.List;

@Service
@Transactional
public class TransferService {

    private final AccountRepository accountRepository;

    public TransferService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Account> getAllAccounts() {
        return accountRepository.findAllAccounts();
    }

    public void transferMoney(long idSender,
                              long idReceiver,
                              BigDecimal amount) {
        Account sender =
        accountRepository.findAccountById(idSender);
        Account receiver =
        accountRepository.findAccountById(idReceiver);

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
