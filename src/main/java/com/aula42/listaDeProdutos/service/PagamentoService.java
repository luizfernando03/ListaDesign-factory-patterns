package com.aula42.listaDeProdutos.service;

import com.aula42.listaDeProdutos.model.CalculadoraPagamento.CalcularValorPago;
import com.aula42.listaDeProdutos.model.CalculadoraPagamento.FactoryValorPagar;
import com.aula42.listaDeProdutos.model.PagamentoModel;
import com.aula42.listaDeProdutos.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagamentoService {

    @Autowired
    private PagamentoRepository pagamentoRepository;
    @Autowired
    private FactoryValorPagar factoryValorPagar;

    public List<PagamentoModel> buscarPagamentos() {
        return pagamentoRepository.findAll ();
    }

    public Optional<PagamentoModel> buscuarpagentoId(long qtdLinha) {
        return pagamentoRepository.findById (qtdLinha);
    }

    public PagamentoModel cadastrarpagamento(PagamentoModel pagamentoModel) {
        CalcularValorPago calcularValorPago = (CalcularValorPago) factoryValorPagar.getCalcularValorPago (pagamentoModel.getStatus ());
        pagamentoModel.setValor (calcularValorPago.calcular (pagamentoModel));
        return pagamentoRepository.save(pagamentoModel);
    }
    public PagamentoModel alterarpagamento(PagamentoModel pagamentoModel) {
        CalcularValorPago calcularValorPago = (CalcularValorPago) factoryValorPagar.getCalcularValorPago (pagamentoModel.getStatus ());
        pagamentoModel.setValor (calcularValorPago.calcular (pagamentoModel));
        return pagamentoRepository.save(pagamentoModel);
    }
    public void deletarPagamento (long qtdLinha){
        pagamentoRepository.deleteById (qtdLinha);
    }


}
