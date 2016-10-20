package com.userfront.domain;

import java.util.Date;

/**
 * Created by z00382545 on 10/19/16.
 */
public class ParimaryTransaction {

    private Long primaryTransactionId;
    private String primaryTransactionName;
    private Date primaryTransactionDate;
    private String primaryTransactionDescription;
    private String primaryTransactionLocation;

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
}
