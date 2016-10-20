package com.userfront.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by z00382545 on 10/19/16.
 */

@Entity
public class Savings {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long savingsId;
    private double savingsBalance;

    @OneToOne
    private Account account;

    @OneToMany(mappedBy = "savings", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<SavingsTransaction> savingsTransactionList;

    public Long getSavingsId() {
        return savingsId;
    }

    public void setSavingsId(Long savingsId) {
        this.savingsId = savingsId;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<SavingsTransaction> getSavingsTransactionList() {
        return savingsTransactionList;
    }

    public void setSavingsTransactionList(List<SavingsTransaction> savingsTransactionList) {
        this.savingsTransactionList = savingsTransactionList;
    }


}
