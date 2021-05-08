package com.credorax.processing.io.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="card")
public class CardEntity implements Serializable {

    private static final long serialVersionUID = 8051324316462829780L;

    @Id
    @GeneratedValue
    private int id;
    private String pan;
    private String expiryDate;
    private String cvv;
    private String panEncr;
    private String expiryDateEncr;
    private String cvvEncr;

    @ManyToOne
    @JoinColumn(name="cardholder_id")
    private CardholderEntity cardholder;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getPanEncr() {
        return panEncr;
    }

    public void setPanEncr(String panEncr) {
        this.panEncr = panEncr;
    }

    public String getExpiryDateEncr() {
        return expiryDateEncr;
    }

    public void setExpiryDateEncr(String expiryDateEncr) {
        this.expiryDateEncr = expiryDateEncr;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getCvvEncr() {
        return cvvEncr;
    }

    public void setCvvEncr(String cvvEncr) {
        this.cvvEncr = cvvEncr;
    }

    public CardholderEntity getCardholder() {
        return cardholder;
    }

    public void setCardholder(CardholderEntity cardholderEntity) {
        this.cardholder = cardholderEntity;
    }

}

