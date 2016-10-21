package com.userfront.service;

import com.userfront.domain.PrimaryTransaction;
import com.userfront.domain.SavingsTransaction;

import java.util.List;

/**
 * Created by z00382545 on 10/20/16.
 */
public interface TransactionService {
    List<PrimaryTransaction> findPrimaryTransactionList();

    List<SavingsTransaction> findSavingsTransactionList();

}
