package com.aula42.listaDeProdutos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "recebimento")
public class RecebimentoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long qtdlinha;
    @Column(length = 50, nullable = false)
    private String status;
    @Column(length = 10, nullable = false)
    private BigDecimal valorRecebimento;
    @Column(length = 10, nullable = false)
    private BigDecimal recebimentoFinal;

}
