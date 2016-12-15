package br.com.farias.javasolid.ocp.solution.models;

import br.com.farias.javasolid.ocp.solution.models.paymentmethod.PaymentMethod;

public class Payment {

    private PaymentMethod method;

    private double value;

    private String account;

    public Payment(double value, String account) {
        setValue(value);
        setAccount(account);
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
