package com.aula42.listaDeProdutos.model.calculadoraRecebimento;

import com.aula42.listaDeProdutos.model.RecebimentoModel;

import java.math.BigDecimal;

public class CalcularValorAReceber {


    public BigDecimal cacular (RecebimentoModel recebimentoModel){
        return recebimentoModel.getRecebimentoFinal ();
    }
}
