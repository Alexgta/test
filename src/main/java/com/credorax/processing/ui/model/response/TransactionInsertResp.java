package com.credorax.processing.ui.model.response;

// TODO: create TransactionsDecryptedRest if need it
public class TransactionInsertResp {

    private int invoice;
    private int amount;
    private String currency;
    boolean approved;

    // Just for
    // TODO: remove after testing:



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

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }




}
