package com.credorax.processing.io.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="transactions")
public class TransactionsEntity implements Serializable {

    private static final long serialVersionUID = 5313493413859894403L;

    @Id
    private int invoice;
    private int amount;             // Optional:  @Column(name="amount" ,nullable=false)
    private String currency;

    @ManyToOne //(cascade = {CascadeType.ALL})
    @JoinColumn(name="card_id")
    private CardEntity card;

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

    public CardEntity getCard() {
        return card;
    }

    public void setCard(CardEntity cardEntity) {
        this.card = cardEntity;
    }
}
