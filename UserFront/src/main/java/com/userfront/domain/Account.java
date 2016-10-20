package com.userfront.domain;

/**
 * Created by z00382545 on 10/19/16.
 */
public class Account {
    private Long accountId;
    private int accountNumber;
    private Primary primary;
    private Savings savings;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Primary getPrimary() {
        return primary;
    }

    public void setPrimary(Primary primary) {
        this.primary = primary;
    }

    public Savings getSavings() {
        return savings;
    }

    public void setSavings(Savings savings) {
        this.savings = savings;
    }
}
