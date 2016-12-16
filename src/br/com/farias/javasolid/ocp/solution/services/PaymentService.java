package br.com.farias.javasolid.ocp.solution.services;


import br.com.farias.javasolid.ocp.solution.models.Payment;
import br.com.farias.javasolid.ocp.solution.paymentmethods.PaymentMethod;

public class PaymentService {

    public void pay(Payment payment, PaymentMethod method) {
        method.pay(payment.getValue(), payment.getAccount());
        /* Other stuff you should do in a payment, like persist it */
    }

}
