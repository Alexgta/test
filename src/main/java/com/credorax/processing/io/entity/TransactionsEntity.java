package com.credorax.processing.io.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="transactions")
public class TransactionsEntity implements Serializable {

    private static final long serialVersionUID = 5313493413859894403L;

    @Id
    @GeneratedValue
    private int id;
    private int invoice;
    private int amount;
    private String currency;
    private String nameEncr;
    private String email;
    private String panEncr;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameEncr() {
        return nameEncr;
    }

    public void setNameEncr(String nameEncr) {
        this.nameEncr = nameEncr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

}
