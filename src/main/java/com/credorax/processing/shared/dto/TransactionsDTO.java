package com.credorax.processing.shared.dto;

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
        return name;
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
        return pan;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    // TODO: remove temp. hack:
    public String getPanEncr() {
        return pan;
    }

    public String getNameEncr() {
        return name;
    }

    public String getExpiryEncr() {
        return expiry;
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

        /*if (this.invoice > 0) {
            this.errors.setInvoice(null);
        } else {
            this.errors.setInvoice("Invoice is required.");
        }*/
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;

        /*if (this.amount > 0) {
            this.errors.setAmount(null);
        } else {
            this.errors.setAmount("Amount should be > 0.");
        }*/
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;

        // Validate
        /*if (this.currency != null) {
            this.errors.setCurrency(null);
        } else {
            this.errors.setCurrency(" should be not null.");
        }*/
    }


    /*
    public void setCard(CardDTO card) {
        this.card = card;

        // Validate card:
        if (this.card.getPan() != null) {
            this.errors.setPan(null);
        } else {
            this.errors.setPan("Pan should be not null.");
        }

        if (this.card.getCvv() == null) {
            this.errors.setCvv("CVV should be not null.");
        } else {
            this.errors.setCvv(null);
        }

        if (this.card.getExpiryDate() == null) {
            this.errors.setExpiryDate("ExpiryDate should be not null.");
        } else if (!CredUtil.expDateIsValid(this.card.getExpiryDate())) {
            this.errors.setExpiryDate("Payment card is invalid or expired.");
        } else {
            this.errors.setExpiryDate(null);
        }

    }*/


    /*
    public void setCardholder(CardholderDTO cardholder) {
        this.cardholder = cardholder;

        // Validate cardholder:
        if (this.getCardholder().getcName() != null) {
            this.errors.setcName(null);
        } else {
            this.errors.setcName("Name should be not null.");
        }

        if (this.getCardholder().getEmail() != null) {
            this.errors.setEmail(null);
        } else {
            this.errors.setEmail("Email should be not null.");
        }

    }*/

    /*public boolean isApproved() {
        return this.approved;
        return this.errors.getInvoice() == null
                && this.errors.getAmount() == null
                && this.errors.getcName() == null
                && this.errors.getEmail() == null
                && this.errors.getPan() == null
                && this.errors.getExpiryDate() == null
                && this.errors.getCvv() == null
                && this.errors.getCurrency() == null;
    }*/

    /*public void setApproved(boolean approved) {
        this.approved = this.errors.getInvoice() == null
                && this.errors.getAmount() == null
                && this.errors.getcName() == null
                && this.errors.getEmail() == null
                && this.errors.getPan() == null
                && this.errors.getExpiryDate() == null
                && this.errors.getCvv() == null
                && this.errors.getCurrency() == null;
       this.approved = approved;
    }*/

    /*public TrunsactionsReqErrors getErrors() {
        return errors;
    }

    public void setErrors(TrunsactionsReqErrors errors) {
        this.errors = errors;
    }*/

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

}
