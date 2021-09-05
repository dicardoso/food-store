package br.edu.ifpb.padroes.service.strategies;

public interface PaymentStrategy {
    default String pay(){
        return "";
    }
}