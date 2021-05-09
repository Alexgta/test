package com.credorax.processing.shared.dto;

import org.apache.tomcat.util.codec.binary.Base64;

import java.io.Serializable;


public class TransactionsDTO implements Serializable {

    private static final long serialVersionUID = 6835192601898364280L;

    private int id;
    private int invoice;
    private int amount;
    private String currency;
    private String email;
    private String cvv;

    private String name;
    private String pan;
    private String expiry;

    private String nameEncr;
    private String panEncr;
    private String expiryEncr;

    private boolean approved = true;
    // private TrunsactionsReqErrors errors;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInvoice() {
        return invoice;
    }

    public String getName() {
        return new String(Base64.decodeBase64(nameEncr));
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPan() {
        return new String(Base64.decodeBase64(panEncr));
    }

    public String getExpiry() {
        return new String(Base64.decodeBase64(expiryEncr));
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getPanEncr() {
        if (this.panEncr != null)
            return this.panEncr;
        else
            return new String(Base64.encodeBase64(pan.getBytes()));
    }

    public String getNameEncr() {
        if (this.nameEncr != null)
            return this.nameEncr;
        else
            return new String(Base64.encodeBase64(this.name.getBytes()));
    }

    public String getExpiryEncr() {
        if (this.expiryEncr != null)
            return this.expiryEncr;
        else
            return new String(Base64.encodeBase64(expiry.getBytes()));
    }

    public void setNameEncr(String nameEncr) {
        this.nameEncr = nameEncr;
    }

    public void setPanEncr(String panEncr) {
        this.panEncr = panEncr;
    }

    public void setExpiryEncr(String expiryEncr) {
        this.expiryEncr = expiryEncr;
    }

    public void setInvoice(int invoice) {
        this.invoice = invoice;

        byte[] encodedBytes = Base64.encodeBase64("Test".getBytes());
        System.out.println("encodedBytes: " + new String(Base64.encodeBase64("Test".getBytes())));
        byte[] decodedBytes = Base64.decodeBase64(encodedBytes);
        System.out.println("decodedBytes " + new String(Base64.decodeBase64(encodedBytes)));

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

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

}
