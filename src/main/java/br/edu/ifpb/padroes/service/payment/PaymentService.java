package br.edu.ifpb.padroes.service.payment;

import br.edu.ifpb.padroes.service.strategies.PaymentStrategy;

public class PaymentService {

    public void doPayment(PaymentStrategy payment) throws Exception {
        payment.pay();
    }
}
