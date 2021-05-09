package com.credorax.processing.ui.model.response;

import com.credorax.processing.shared.TrunsactionsReqErrors;
import com.fasterxml.jackson.annotation.JsonInclude;

// TODO: create TransactionsDecryptedRest if need it
public class TransactionInsertResp {

    private boolean approved;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private TrunsactionsReqErrors errors;

    public TransactionInsertResp() {
        errors = new TrunsactionsReqErrors();
    }

    // Just for testing
    // TODO: remove after testing:
    private int id;
    private int invoice;
    private int amount;
    private String currency;
    private String name;
    private String nameEncr;
    private String email;
    private String pan;
    private String panEncr;
    private String expiry;
    private String expiryEncr;


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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPanEncr() {
        return panEncr;
    }

    public void setPanEncr(String panEncr) {
        this.panEncr = panEncr;
    }

    public String getExpiryEncr() {
        return expiryEncr;
    }

    public void setExpiryEncr(String expiryEncr) {
        this.expiryEncr = expiryEncr;
    }

    public String getNameEncr() {
        return nameEncr;
    }

    public void setNameEncr(String nameEncr) {
        this.nameEncr = nameEncr;
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
