package com.aula42.listaDeProdutos.model.CalculadoraPagamento;

import com.aula42.listaDeProdutos.model.PagamentoModel;

import java.math.BigDecimal;

public interface CalcularValorPago {
    BigDecimal calcular(PagamentoModel pagamentoModel);
}
