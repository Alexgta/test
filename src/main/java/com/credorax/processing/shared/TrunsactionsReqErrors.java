package com.credorax.processing.shared;

public class TrunsactionsReqErrors {

    // invoce:
    private String invoice;
    private String amount;
    private String currency;

    // cardholder:
    private String name;
    private String email;

    // card
    private String pan;
    private String expiry;
    private String cvv;

    // TODO: dublicate. Delete this method later, if don't need it.
    public Boolean getStatus() {
        return this.invoice == null
                && this.amount == null
                && this.name == null
                && this.email == null
                && this.pan == null
                && this.expiry == null
                && this.cvv == null
                && this.currency == null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
