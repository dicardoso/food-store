package br.edu.ifpb.padroes.service.state;

public enum OrderStateEnum implements OrderState{
    IN_PROGRESS{
        public OrderState statusInProgress(){
            System.out.println("Pedido em progresso");
            return null;
        }
    },

    CANCELED{
        public OrderState statusCanceled(){
            System.out.println("Pedido em cancelado");
            return null;
        }
    }
}