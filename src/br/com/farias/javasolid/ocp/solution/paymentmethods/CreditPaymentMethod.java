package br.com.farias.javasolid.ocp.solution.paymentmethods;

public class CreditPaymentMethod implements PaymentMethod {

    @Override
    public void pay(double value, String account) {
        System.out.println(String.format("Payed $%.2f to %s (PAYMENT METHOD: CREDIT)", value, account));
    }
}
