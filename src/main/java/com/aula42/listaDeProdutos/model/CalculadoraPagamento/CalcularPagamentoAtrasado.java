package com.aula42.listaDeProdutos.model.CalculadoraPagamento;

import com.aula42.listaDeProdutos.model.PagamentoModel;

import java.math.BigDecimal;

public class CalcularPagamentoAtrasado implements CalcularValorPago{

    @Override
    public BigDecimal calcular(PagamentoModel pagamentoModel) {
        return pagamentoModel.getValor ().add (pagamentoModel.getDiferenca ()) ;
    }
}
