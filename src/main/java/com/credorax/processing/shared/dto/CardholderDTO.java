package com.credorax.processing.shared.dto;

import java.io.Serializable;

public class CardholderDTO implements Serializable {

    private static final long serialVersionUID = 6835192601898364280L;

    private int id;
    private String cName;
    private String email;
    private String cNameEncr;
    private String emailEncr;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getcNameEncr() {
        return cNameEncr;
    }

    public void setcNameEncr(String cNameEncr) {
        this.cNameEncr = cNameEncr;
    }

    public String getEmailEncr() {
        return emailEncr;
    }

    public void setEmailEncr(String emailEncr) {
        this.emailEncr = emailEncr;
    }
}
