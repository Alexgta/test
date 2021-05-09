package com.credorax.processing.ui.model.request;

public class TransactionsRequest {

    private int invoice;
    private int amount;
    private String currency;
    private String name;
    private String email;
    private String pan;
    private String expiry;
    private String cvv;

    CcardholderRequest cardholder;
    CardRequest card;


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

    public CcardholderRequest getCardholder() {
        return cardholder;
    }

    public void setCardholder(CcardholderRequest cardholder) {
        this.cardholder = cardholder;
    }

    public CardRequest getCard() {
        return card;
    }

    public void setCard(CardRequest card) {
        this.card = card;
    }

    public String getName() {
        return cardholder.getName();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return cardholder.getEmail();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPan() {
        return card.getPan();
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getExpiry() {
        return card.getExpiry();
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public String getCvv() {
        return card.getCvv();
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}
