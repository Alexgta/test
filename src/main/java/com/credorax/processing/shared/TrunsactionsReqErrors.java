package com.credorax.processing.shared;

import com.fasterxml.jackson.annotation.JsonInclude;

public class TrunsactionsReqErrors {

    // invoce:
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String invoice;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String amount;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String currency;

    // cardholder:
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String email;

    // card
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String pan;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String expiry;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String cvv;

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
