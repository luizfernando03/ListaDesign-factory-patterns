package com.aula42.listaDeProdutos.model.CalculadoraPagamento;

import com.aula42.listaDeProdutos.model.PagamentoModel;

import java.math.BigDecimal;

public class CalcularPagamentoEmDia implements CalcularValorPago {

    @Override
    public BigDecimal calcular(PagamentoModel pagamentoModel) {
        return pagamentoModel.getValor ().subtract (pagamentoModel.getDiferenca ()) ;
    }
}
