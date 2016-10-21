package com.userfront.service.impl;

import com.userfront.dao.PrimaryTransactionDao;
import com.userfront.dao.SavingsTransactionDao;
import com.userfront.domain.PrimaryTransaction;
import com.userfront.domain.SavingsTransaction;
import com.userfront.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by z00382545 on 10/20/16.
 */

@Service
public class TransactionServiceImpl implements TransactionService{

    @Autowired
    private PrimaryTransactionDao primaryTransactionDao;

    @Autowired
    private SavingsTransactionDao savingsTransactionDao;

    public List<PrimaryTransaction> findPrimaryTransactionList(){
        return primaryTransactionDao.findAll();
    }

    public List<SavingsTransaction> findSavingsTransactionList() {
        return savingsTransactionDao.findAll();
    }

    public void savePrimaryDepositTransaction(PrimaryTransaction primaryTransaction) {
        primaryTransactionDao.save(primaryTransaction);
    }

    public void saveSavingsDepositTransaction(SavingsTransaction savingsTransaction) {
        savingsTransactionDao.save(savingsTransaction);
    }
}
