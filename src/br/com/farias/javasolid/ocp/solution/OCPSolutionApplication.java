package br.com.farias.javasolid.ocp.solution;


import br.com.farias.javasolid.ocp.solution.models.Payment;
import br.com.farias.javasolid.ocp.solution.paymentmethods.PaymentMethod;
import br.com.farias.javasolid.ocp.solution.paymentmethods.PaypalPaymentMethod;
import br.com.farias.javasolid.ocp.solution.services.PaymentService;
import br.com.farias.javasolid.ocp.solution.paymentmethods.CreditPaymentMethod;
import br.com.farias.javasolid.ocp.solution.paymentmethods.DebitPaymentMethod;

public class OCPSolutionApplication {

    public static void main(String[] args) {
        PaymentService service = new PaymentService();

        PaymentMethod credit = new CreditPaymentMethod();
        PaymentMethod debit = new DebitPaymentMethod();
        PaymentMethod paypal = new PaypalPaymentMethod();

        service.pay(new Payment(250d, "46578909"), credit);
        service.pay(new Payment(21.60d, "67547249"), debit);
        service.pay(new Payment(21d, "14534529"), credit);
        service.pay(new Payment(1230d, "13321445"), debit);
        service.pay(new Payment(321d, "12313131"), paypal);
    }

}
