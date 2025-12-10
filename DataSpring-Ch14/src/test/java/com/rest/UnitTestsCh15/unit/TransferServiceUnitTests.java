package com.rest.UnitTestsCh15.unit;

import com.rest.UnitTestsCh15.models.Account;
import com.rest.UnitTestsCh15.repositories.AccountRepository;
import com.rest.UnitTestsCh15.services.TransferService;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.BDDMockito.given;

import java.math.BigDecimal;
import java.util.Optional;

public class TransferServiceUnitTests {

    @Test
    public void moneyTransferHappyFlow() {
        AccountRepository accountRepository =
                mock(AccountRepository.class);
        TransferService transferService =
                new TransferService(accountRepository);

        Account sender = new Account();
        sender.setId(1);
        sender.setAmount(new BigDecimal(1000));

        Account destination = new Account();
        destination.setId(2);
        destination.setAmount(new BigDecimal(1000));

        given(accountRepository.findById(sender.getId()))
                .willReturn(Optional.of(sender));

        given(accountRepository.findById(destination.getId()))
                .willReturn(Optional.of(destination));

        transferService.transferMoney(
                sender.getId(),
                destination.getId(),
                new BigDecimal(100)
        );

        verify(accountRepository)
      .changeAmount(1, new BigDecimal(900));

        verify(accountRepository)
      .changeAmount(2, new BigDecimal(1100));


    }

}
