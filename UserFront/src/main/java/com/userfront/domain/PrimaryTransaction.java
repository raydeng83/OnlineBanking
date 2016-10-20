package com.userfront.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by z00382545 on 10/19/16.
 */
@Entity
public class PrimaryTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long primaryTransactionId;
    private String primaryTransactionName;
    private Date primaryTransactionDate;
    private String primaryTransactionDescription;
    private String primaryTransactionLocation;

    @ManyToOne
    private PrimaryAccount primaryAccount;

    public Long getPrimaryTransactionId() {
        return primaryTransactionId;
    }

    public void setPrimaryTransactionId(Long primaryTransactionId) {
        this.primaryTransactionId = primaryTransactionId;
    }

    public String getPrimaryTransactionName() {
        return primaryTransactionName;
    }

    public void setPrimaryTransactionName(String primaryTransactionName) {
        this.primaryTransactionName = primaryTransactionName;
    }

    public Date getPrimaryTransactionDate() {
        return primaryTransactionDate;
    }

    public void setPrimaryTransactionDate(Date primaryTransactionDate) {
        this.primaryTransactionDate = primaryTransactionDate;
    }

    public String getPrimaryTransactionDescription() {
        return primaryTransactionDescription;
    }

    public void setPrimaryTransactionDescription(String primaryTransactionDescription) {
        this.primaryTransactionDescription = primaryTransactionDescription;
    }

    public String getPrimaryTransactionLocation() {
        return primaryTransactionLocation;
    }

    public void setPrimaryTransactionLocation(String primaryTransactionLocation) {
        this.primaryTransactionLocation = primaryTransactionLocation;
    }

    public PrimaryAccount getPrimaryAccount() {
        return primaryAccount;
    }

    public void setPrimaryAccount(PrimaryAccount primaryAccount) {
        this.primaryAccount = primaryAccount;
    }
}
