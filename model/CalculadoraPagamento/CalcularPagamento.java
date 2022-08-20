package com.aula42.listaDeProdutos.model.CalculadoraPagamento;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

public class CalcularPagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(length = 50, nullable = false)
    private String status;

    @Column(length = 10, nullable = false)
    private BigDecimal valorAPagar;

    @Column(length = 10, nullable = false)
    private BigDecimal diferencaValor;

    @Column(length = 10, nullable = false)
    private BigDecimal valorPago;

}
