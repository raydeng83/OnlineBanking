package com.userfront.controller;

import com.userfront.domain.PrimaryTransaction;
import com.userfront.domain.SavingsTransaction;
import com.userfront.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by z00382545 on 10/20/16.
 */

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private TransactionService transactionService;

    @RequestMapping("/primaryAccount")
    public String primaryAccount(Model model) {
        List<PrimaryTransaction> primaryTransactionList = transactionService.findPrimaryTransactionList();

        model.addAttribute("primaryTransactionList", primaryTransactionList);

        return "primaryAccount";
    }

    @RequestMapping("/savingsAccount")
    public String savingsAccount(Model model) {
        List<SavingsTransaction> savingsTransactionList = transactionService.findSavingsTransactionList();

        model.addAttribute("savingsTransactionList", savingsTransactionList);

        return "savingsAccount";
    }
}
