package com.aula42.listaDeProdutos.model.calculadoraRecebimento;

import com.aula42.listaDeProdutos.model.CalculadoraPagamento.FactoryValorPagar;
import com.aula42.listaDeProdutos.model.RecebimentoModel;

import java.math.BigDecimal;

public interface ValorAReceber {
    BigDecimal calcular(RecebimentoModel recebimentoModel);

    CalcularValorAReceber getCalcularValorAReceber(BigDecimal recebimentoFinal);
}
