package br.edu.ifpb.padroes.service.state;

import br.edu.ifpb.padroes.domain.Order;

public interface OrderState {

    Order statusInProgress();
    Order statusCanceled();
}