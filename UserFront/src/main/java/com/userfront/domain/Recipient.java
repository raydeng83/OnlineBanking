package com.userfront.domain;

/**
 * Created by z00382545 on 10/19/16.
 */
public class Recipient {

    private Long recipientId;
    private String recipientName;
    private String recipientEmail;
    private String recipientPhone;
    private int recipientAccountNumber;

    public Long getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(Long recipientId) {
        this.recipientId = recipientId;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getRecipientEmail() {
        return recipientEmail;
    }

    public void setRecipientEmail(String recipientEmail) {
        this.recipientEmail = recipientEmail;
    }

    public String getRecipientPhone() {
        return recipientPhone;
    }

    public void setRecipientPhone(String recipientPhone) {
        this.recipientPhone = recipientPhone;
    }

    public int getRecipientAccountNumber() {
        return recipientAccountNumber;
    }

    public void setRecipientAccountNumber(int recipientAccountNumber) {
        this.recipientAccountNumber = recipientAccountNumber;
    }
}
