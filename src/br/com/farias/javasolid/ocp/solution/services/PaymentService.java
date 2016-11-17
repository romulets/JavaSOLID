package br.com.farias.javasolid.ocp.solution.services;


import br.com.farias.javasolid.ocp.solution.models.Payment;
import br.com.farias.javasolid.ocp.solution.models.paymentmethod.PaymentMethod;

public class PaymentService {


    public void pay(Payment payment) {
        PaymentMethod method = payment.getMethod();
        method.pay(payment.getValue(), payment.getAccount());
    }

}
