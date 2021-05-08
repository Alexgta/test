package com.credorax.processing.ui.model.response;

public class TransactionsRest {

    private int invoice;
    private int amount;
    private String currency;
    private CardholderRest cardholder;
    private CardRest card;

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

    public CardholderRest getCardholder() {
        return cardholder;
    }

    public void setCardholder(CardholderRest cardholder) {
        this.cardholder = cardholder;
    }

    public CardRest getCard() {
        return card;
    }

    public void setCard(CardRest card) {
        this.card = card;
    }
}
