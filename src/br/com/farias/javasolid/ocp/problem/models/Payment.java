package br.com.farias.javasolid.ocp.problem.models;

public class Payment {

    private PaymentMethod method;

    private double value;

    private String account;

    public Payment(PaymentMethod method, double value, String account) {
        setMethod(method);
        setValue(value);
        setAccount(account);
    }

    public PaymentMethod getMethod() {
        return method;
    }

    private void setMethod(PaymentMethod method) {
        this.method = method;
    }

    public double getValue() {
        return value;
    }

    private void setValue(double value) {
        this.value = value;
    }

    public String getAccount() {
        return account;
    }

    private void setAccount(String account) {
        this.account = account;
    }
}
