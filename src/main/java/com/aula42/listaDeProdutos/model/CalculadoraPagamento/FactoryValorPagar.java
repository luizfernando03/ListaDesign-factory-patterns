package com.aula42.listaDeProdutos.model.CalculadoraPagamento;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class FactoryValorPagar {
    public Object getCalcularValorPago(String statusPagamento) {
        if (statusPagamento.equalsIgnoreCase ("PAGAMENTO_ATRASADO")) {
            return new CalcularPagamentoAtrasado ();
        } else if (statusPagamento.equalsIgnoreCase ("PAGAMENTO_EM_DIA")) {
            return new CalcularPagamentoEmDia ();
        } else {
            return null;
        }
    }

}
