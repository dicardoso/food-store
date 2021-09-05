package br.edu.ifpb.padroes.service.strategies;

public class BilletStrategy implements PaymentStrategy{
    @Override
    public String pay() {
        String order = "Compra finalizada no Boleto";
        return order;
    }
}