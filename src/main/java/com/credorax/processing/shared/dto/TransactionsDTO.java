package com.credorax.processing.shared.dto;

import java.io.Serializable;

public class TransactionsDTO implements Serializable {

    private static final long serialVersionUID = 6835192601898364280L;

    private int invoice;
    private int amount;
    private String currency;
    //private int cardId;
    private CardDTO card;

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

    public CardDTO getCard() {
        return card;
    }

    public void setCard(CardDTO card) {
        this.card = card;
    }

}
