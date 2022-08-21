package com.aula42.listaDeProdutos.model.calculadoraRecebimento;

import com.aula42.listaDeProdutos.model.CalculadoraPagamento.FactoryValorPagar;
import com.aula42.listaDeProdutos.model.RecebimentoModel;

import java.math.BigDecimal;

public class CalcularValorAReceberDinheiro implements ValorAReceber{

    @Override
    public BigDecimal calcular(RecebimentoModel recebimentoModel) {
        return null;
    }

    @Override
    public CalcularValorAReceber getCalcularValorAReceber(BigDecimal recebimentoFinal) {
        return null;
    }

}
