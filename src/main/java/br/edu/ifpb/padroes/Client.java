package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.domain.Order;
import br.edu.ifpb.padroes.service.order.OrderManager;
import br.edu.ifpb.padroes.service.payment.PaymentService;
import br.edu.ifpb.padroes.service.strategies.DebitStrategy;
import br.edu.ifpb.padroes.service.strategies.PaymentStrategy;

public class Client {
    public static void main(String[] args) {

        Order order = new Order();
        OrderManager orderManager = new OrderManager(order);
        orderManager.cancelOrder();

        PaymentStrategy payment = orderManager.payOrder(new DebitStrategy());
        payment.pay();
    }
}
