package br.com.farias.javasolid.ocp.solution.paymentmethods;

public class PaypalPaymentMethod implements PaymentMethod {

    @Override
    public void pay(double value, String account) {
        System.out.println(String.format("Payed $%.2f to %s (PAYMENT METHOD: PAYPAL)", value, account));
    }
}
