package com.userfront.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by z00382545 on 10/19/16.
 */

@Entity
public class Primary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long primaryId;
    private Double primaryNumber;

    @OneToOne
    private Account account;

    @OneToMany(mappedBy = "primary", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PrimaryTransaction> primaryTransactionList;

    public Long getPrimaryId() {
        return primaryId;
    }

    public void setPrimaryId(Long primaryId) {
        this.primaryId = primaryId;
    }

    public Double getPrimaryNumber() {
        return primaryNumber;
    }

    public void setPrimaryNumber(Double primaryNumber) {
        this.primaryNumber = primaryNumber;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<PrimaryTransaction> getPrimaryTransactionList() {
        return primaryTransactionList;
    }

    public void setPrimaryTransactionList(List<PrimaryTransaction> primaryTransactionList) {
        this.primaryTransactionList = primaryTransactionList;
    }
}
