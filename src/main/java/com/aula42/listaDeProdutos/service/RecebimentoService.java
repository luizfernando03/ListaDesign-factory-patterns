package com.aula42.listaDeProdutos.service;

import com.aula42.listaDeProdutos.model.CalculadoraPagamento.FactoryValorPagar;
import com.aula42.listaDeProdutos.model.RecebimentoModel;
import com.aula42.listaDeProdutos.model.calculadoraRecebimento.CalcularValorAReceber;
import com.aula42.listaDeProdutos.model.calculadoraRecebimento.ValorAReceber;
import com.aula42.listaDeProdutos.repository.RecebimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class RecebimentoService {
    @Autowired
    private RecebimentoRepository recebimentoRepository;
    @Autowired
    private ValorAReceber valorAReceber;

    public List<RecebimentoRepository> buscarTodos(){return recebimentoRepository.findAll();
    }
    public Optional<RecebimentoRepository> buscarRecebimentoId(long recebimento){
        return recebimentoRepository.findById (recebimento);
    }
    public RecebimentoModel cadastrarRecebimento(RecebimentoModel recebimentoModel){
        CalcularValorAReceber calcularValorAReceber = valorAReceber.getCalcularValorAReceber(recebimentoModel.getRecebimentoFinal ());
        recebimentoModel.setValorRecebimento (calcularValorAReceber.cacular (recebimentoModel));
        return (RecebimentoModel) recebimentoRepository;
    }
    public RecebimentoModel alterarRecebimento(RecebimentoModel recebimentoModel){
        CalcularValorAReceber calcularValorAReceber = valorAReceber.getCalcularValorAReceber(recebimentoModel.getRecebimentoFinal ());
        recebimentoModel.setValorRecebimento (calcularValorAReceber.cacular (recebimentoModel));
        return (RecebimentoModel) recebimentoRepository;
    }
    public void deletar(Long codigo){
    }
}
