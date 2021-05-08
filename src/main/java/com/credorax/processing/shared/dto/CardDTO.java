package com.credorax.processing.shared.dto;

public class CardDTO {


    private int id;
    private String pan;
    private String expiryDate;
    private String cvv;
    private String panEncr;
    private String expiryDateEncr;
    private String cvvEncr;
    //private int cardholderId;
    private CardholderDTO cardholder;

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

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
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

    public String getCvvEncr() {
        return cvvEncr;
    }

    public void setCvvEncr(String cvvEncr) {
        this.cvvEncr = cvvEncr;
    }

    public CardholderDTO getCardholder() {
        return cardholder;
    }

    public void setCardholder(CardholderDTO cardholder) {
        this.cardholder = cardholder;
    }
}
