package br.edu.ifpb.padroes.service.strategies;

public class CreditCardStrategy implements PaymentStrategy{
    @Override
    public String pay() {
        String order = "Compra finalizada no Cartão de Credito";
        return order;
    }
}