package br.edu.ifpb.padroes.service.strategies;

public class DebitStrategy implements PaymentStrategy{
    @Override
    public String pay() {
        String order = "Compra finalizada no Cartão de Débito";
        return order;
    }
}