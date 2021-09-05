package br.edu.ifpb.padroes.service.strategies;

public class PayPalStrategy implements PaymentStrategy{
    @Override
    public String pay() {
        String order = "Compra finalizada no PayPal";
        return order;
    }
}