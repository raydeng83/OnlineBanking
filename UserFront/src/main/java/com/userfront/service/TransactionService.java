package com.userfront.service;

import com.userfront.domain.PrimaryAccount;
import com.userfront.domain.PrimaryTransaction;
import com.userfront.domain.SavingsAccount;
import com.userfront.domain.SavingsTransaction;

import java.util.List;

/**
 * Created by z00382545 on 10/20/16.
 */
public interface TransactionService {
    List<PrimaryTransaction> findPrimaryTransactionList();

    List<SavingsTransaction> findSavingsTransactionList();

    void savePrimaryDepositTransaction(PrimaryTransaction primaryTransaction);

    void saveSavingsDepositTransaction(SavingsTransaction savingsTransaction);

    void betweenAccountsTransfer(String transferFrom, String transferTo, String amount, PrimaryAccount primaryAccount, SavingsAccount savingsAccount) throws Exception;
}
