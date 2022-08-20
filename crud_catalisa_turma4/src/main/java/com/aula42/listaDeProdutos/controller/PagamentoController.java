package com.aula42.listaDeProdutos.controller;

import com.aula42.listaDeProdutos.model.PagamentoModel;
import com.aula42.listaDeProdutos.model.valoresProdutos.CalculoDesconto;
import com.aula42.listaDeProdutos.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PagamentoController {

    @Autowired
    private PagamentoService pagamentoService;

    @GetMapping(path = "/pagamento")
    public List<PagamentoModel> buscarTodospagamento(){
        return pagamentoService.buscarPagamentos ();
    }

    @GetMapping(path = "/pagamento/{codigo}")
    public Optional<PagamentoModel> buscarPorId(@PathVariable Long codigo){
        return pagamentoService.buscuarpagentoId (codigo);
    }

    @PostMapping(path = "/pagamento/{codigo}")
    public PagamentoModel cadastrarPagamento(@RequestBody PagamentoModel pagamentoModel){
        return pagamentoService.cadastrarpagamento (pagamentoModel);
    }

    @PutMapping(path = "/pagamento/{codigo}")
    public PagamentoModel alterarPagamento(@RequestBody PagamentoModel pagamentoModel){
        return pagamentoService.alterarpagamento (pagamentoModel);
    }

    @DeleteMapping(path = "/pagamento/{qtdlinha}")
    public void deletarPagamento(@PathVariable Long qtdlinha){pagamentoService.deletarPagamento (qtdlinha);
    }
}
