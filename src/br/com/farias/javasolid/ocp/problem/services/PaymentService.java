package br.com.farias.javasolid.ocp.problem.services;

import br.com.farias.javasolid.ocp.problem.models.Payment;

public class PaymentService {


    public void pay(Payment payment) {
        switch (payment.getMethod()) {
            case CREDIT:
                System.out.println(
                        String.format("Payed $%.2f to %s (PAYMENT METHOD: CREDIT)",
                                payment.getValue(), payment.getAccount())
                );
                break;

            case DEBIT:
                System.out.println(
                        String.format("Payed $%.2f to %s (PAYMENT METHOD: DEBIT)",
                                payment.getValue(), payment.getAccount())
                );
                break;
        }
    }

}
