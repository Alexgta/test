package com.credorax.processing.ui.model.response;

import com.credorax.processing.shared.TrunsactionsReqErrors;
import com.fasterxml.jackson.annotation.JsonInclude;


public class TransactionInsertResp {

    private int invoice;
    private int amount;
    private String currency;
    private String name;
    private String email;
    private String pan;
    private String expiry;

    private boolean approved;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private TrunsactionsReqErrors errors;

    public TransactionInsertResp() {
        errors = new TrunsactionsReqErrors();
    }

    public int getInvoice() {
        return invoice;
    }

    public void setInvoice(int invoice) {
        this.invoice = invoice;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public String getName() {
        return this.name ;// .replaceAll(".", "*");
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
        return "************" + pan.substring(pan.length() - 4);
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getExpiry() {
        return "****";
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public TrunsactionsReqErrors getErrors() {
        if (this.approved)
            return null;
        else
            return errors;
    }

    public void setErrors(TrunsactionsReqErrors errors) {
        this.errors = errors;
    }

}
