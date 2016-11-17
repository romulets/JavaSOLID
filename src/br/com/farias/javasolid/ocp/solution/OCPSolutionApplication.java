package br.com.farias.javasolid.ocp.solution;


import br.com.farias.javasolid.ocp.solution.models.Payment;
import br.com.farias.javasolid.ocp.solution.models.paymentmethod.PaypalPaymentMethod;
import br.com.farias.javasolid.ocp.solution.services.PaymentService;
import br.com.farias.javasolid.ocp.solution.models.paymentmethod.CreditPaymentMethod;
import br.com.farias.javasolid.ocp.solution.models.paymentmethod.DebitPaymentMethod;

public class OCPSolutionApplication {

    public static void main(String[] args) {
        PaymentService service = new PaymentService();

        service.pay(new Payment(new CreditPaymentMethod(), 250d, "46578909"));
        service.pay(new Payment(new DebitPaymentMethod(), 21.60d, "67547249"));
        service.pay(new Payment(new CreditPaymentMethod(), 21d, "14534529"));
        service.pay(new Payment(new DebitPaymentMethod(), 1230d, "13321445"));
        service.pay(new Payment(new PaypalPaymentMethod(), 321d, "12313131"));
    }

}
