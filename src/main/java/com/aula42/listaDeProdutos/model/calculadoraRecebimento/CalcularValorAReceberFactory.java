package com.aula42.listaDeProdutos.model.calculadoraRecebimento;

public class CalcularValorAReceberFactory {
    public CalcularValorAReceberDinheiro getCalcularValorAReceber(String statusMetodoPagamento) {
        if (statusMetodoPagamento.equalsIgnoreCase ("Dinheiro")) {
            return new CalcularValorAReceberDinheiro ();

        }else if (statusMetodoPagamento.equalsIgnoreCase("Cartao")){
            return new CalcularValorAReceberDinheiro ();
        }else {
            return null;
        }

    }
}