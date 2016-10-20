package com.userfront.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by z00382545 on 10/19/16.
 */

@Entity
public class SavingsTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long savingsTransactionId;
    private String savingsTransactionName;
    private Date savingsTransactionDate;
    private String savingsTransactionDescription;
    private String savingsTransactionLocation;

    @ManyToOne
    private Savings savings;

    public Long getSavingsTransactionId() {
        return savingsTransactionId;
    }

    public void setSavingsTransactionId(Long savingsTransactionId) {
        this.savingsTransactionId = savingsTransactionId;
    }

    public String getSavingsTransactionName() {
        return savingsTransactionName;
    }

    public void setSavingsTransactionName(String savingsTransactionName) {
        this.savingsTransactionName = savingsTransactionName;
    }

    public Date getSavingsTransactionDate() {
        return savingsTransactionDate;
    }

    public void setSavingsTransactionDate(Date savingsTransactionDate) {
        this.savingsTransactionDate = savingsTransactionDate;
    }

    public String getSavingsTransactionDescription() {
        return savingsTransactionDescription;
    }

    public void setSavingsTransactionDescription(String savingsTransactionDescription) {
        this.savingsTransactionDescription = savingsTransactionDescription;
    }

    public String getSavingsTransactionLocation() {
        return savingsTransactionLocation;
    }

    public void setSavingsTransactionLocation(String savingsTransactionLocation) {
        this.savingsTransactionLocation = savingsTransactionLocation;
    }

    public Savings getSavings() {
        return savings;
    }

    public void setSavings(Savings savings) {
        this.savings = savings;
    }


}
