package com.credorax.processing.ui.model.response;

public class CardholderRest {

    private String cName;
    private String email;
    private String cNameEncr;
    private String emailEncr;

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
