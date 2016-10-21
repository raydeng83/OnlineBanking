package com.userfront.service.impl;

import com.userfront.dao.PrimaryAccountDao;
import com.userfront.dao.PrimaryTransactionDao;
import com.userfront.dao.SavingsAccountDao;
import com.userfront.domain.PrimaryAccount;
import com.userfront.domain.PrimaryTransaction;
import com.userfront.domain.SavingsAccount;
import com.userfront.domain.User;
import com.userfront.service.AccountService;
import com.userfront.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by z00382545 on 10/21/16.
 */

@Service
public class AccountServiceImpl implements AccountService {

    private static int nextAccountNumber = 1;

    @Autowired
    private PrimaryAccountDao primaryAccountDao;

    @Autowired
    private SavingsAccountDao savingsAccountDao;

    @Autowired
    private UserService userService;

    @Autowired
    private PrimaryTransactionDao primaryTransactionDao;

    public PrimaryAccount createPrimaryAccount () {
        PrimaryAccount primaryAccount = new PrimaryAccount();
        primaryAccount.setAccountBalance(0.0);
        primaryAccount.setAccountNumber(accountGen());

        primaryAccountDao.save(primaryAccount);

        return primaryAccountDao.findByAccountNumber(primaryAccount.getAccountNumber());
    }

    public SavingsAccount createSavingsAccount () {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setAccountBalance(0.0);
        savingsAccount.setAccountNumber(accountGen());

        savingsAccountDao.save(savingsAccount);

        return savingsAccountDao.findByAccountNumber(savingsAccount.getAccountNumber());
    }

    public void deposit(String accountType, double amount, Principal principal) {
        User user = userService.findByUsername(principal.getName());

        if (accountType.equalsIgnoreCase("Primary")) {
            PrimaryAccount primaryAccount = user.getPrimaryAccount();
            primaryAccount.setAccountBalance(primaryAccount.getAccountBalance()+amount);
            primaryAccountDao.save(primaryAccount);

            PrimaryTransaction primaryTransaction = new PrimaryTransaction();
            Date date = new Date();
            SimpleDateFormat ft = new SimpleDateFormat ("MM/dd/yyyy");
            System.out.println(ft.format(date));
            primaryTransaction.setDate(date);
            primaryTransaction.setPrimaryAccount(primaryAccount);
            primaryTransaction.setAmount(amount);
            primaryTransaction.setAvailableBalance(primaryAccount.getAccountBalance());
            primaryTransaction.setDescription("Deposit to Primary Account");
            primaryTransaction.setStatus("Finished");
            primaryTransaction.setType("Account");
            primaryTransactionDao.save(primaryTransaction);

        } else if (accountType.equalsIgnoreCase("Savings")) {
            SavingsAccount savingsAccount = user.getSavingsAccount();
            savingsAccount.setAccountBalance(savingsAccount.getAccountBalance()+amount);
            savingsAccountDao.save(savingsAccount);
        }
    }

    private int accountGen () {
        return  ++nextAccountNumber;
    }


}
