package com.credorax.processing.ui.model.request;

public class TransactionsRequestModel {

    private int invoice;
    private int amount;
    private String currency;
    CardholderRequestModel cardholder;
    CardRequestModel card;


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

    public CardholderRequestModel getCardholder() {
        return cardholder;
    }

    public void setCardholder(CardholderRequestModel cardholder) {
        this.cardholder = cardholder;
    }

    public CardRequestModel getCard() {
        return card;
    }

    public void setCard(CardRequestModel card) {
        this.card = card;
    }

}
