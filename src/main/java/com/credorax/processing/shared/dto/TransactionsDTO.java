package com.credorax.processing.shared.dto;

import com.credorax.processing.shared.CredUtil;
import com.credorax.processing.shared.TrunsactionsReqErrors;
import com.fasterxml.jackson.annotation.JsonInclude;
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
    private TrunsactionsReqErrors errors;


    public TransactionsDTO() {
        this.errors = new TrunsactionsReqErrors();
    }

    public boolean validate() {

        if (this.invoice <= 0)
            errors.setInvoice("Invoice is required.");

        if (this.amount == 0)
            errors.setAmount("Amount is required.");
            // TODO add check ammount method
        else if (this.amount < 0)
            errors.setAmount("Amount should be positive number.");


        if (this.currency == null || this.currency.equals(""))
            errors.setCurrency("Currency is required.");


        if (this.name == null || this.name.equals(""))
            errors.setName("Name is required.");


        if (this.email == null || this.email.equals(""))
            errors.setEmail("Email is required.");
        else if (!CredUtil.emailIsInValidFormat(this.email))
            errors.setEmail("Email should have a valid format.");


        if (this.pan == null || this.pan.equals(""))
            errors.setPan("PAN is required.");
        else if (!CredUtil.panIsValid(this.pan))
            errors.setPan("PAN should be 16 digits long and pass a Luhn check.");


        if (this.expiry == null || this.expiry.equals(""))
            errors.setExpiry("Expire date is required.");
        else if (!CredUtil.expDateIsValid(this.expiry))
            errors.setExpiry("Expiry date should be valid and not in the past.");


        if (this.cvv == null || this.cvv.equals(""))
            errors.setCvv("CVV is required.");

        this.approved = errors.getInvoice() == null
                && errors.getAmount() == null
                && errors.getCurrency() == null
                && errors.getName() == null
                && errors.getEmail() == null
                && errors.getPan() == null
                && errors.getExpiry() == null
                && errors.getCvv() == null;
        return this.approved;
    }


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
        if (this.nameEncr != null)
            return new String(Base64.decodeBase64(nameEncr));
        else
            return null;
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
        if (this.panEncr != null)
            return new String(Base64.decodeBase64(this.panEncr));
        else
            return null;
    }

    public String getExpiry() {
        if (this.expiryEncr != null) {
            return new String(Base64.decodeBase64(this.expiryEncr));
        } else
            return null;
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

    public TrunsactionsReqErrors getErrors() {
        return errors;
    }

    public void setErrors(TrunsactionsReqErrors errors) {
        this.errors = errors;
    }
}
