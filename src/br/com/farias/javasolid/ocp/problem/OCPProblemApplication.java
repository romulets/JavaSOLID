package br.com.farias.javasolid.ocp.problem;

import br.com.farias.javasolid.ocp.problem.models.Payment;
import br.com.farias.javasolid.ocp.problem.models.PaymentMethod;
import br.com.farias.javasolid.ocp.problem.services.PaymentService;

public class OCPProblemApplication {

    public static void main(String[] args) {
        PaymentService service = new PaymentService();

        service.pay(new Payment(PaymentMethod.CREDIT, 250d, "46578909"));
        service.pay(new Payment(PaymentMethod.DEBIT, 21.60d, "67547249"));
        service.pay(new Payment(PaymentMethod.CREDIT, 123d, "14534529"));
        service.pay(new Payment(PaymentMethod.DEBIT, 546d, "13321445"));
    }

}
