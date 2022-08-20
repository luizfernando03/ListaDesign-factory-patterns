package com.aula42.listaDeProdutos.controller;

import com.aula42.listaDeProdutos.model.PagamentoModel;
import com.aula42.listaDeProdutos.repository.RecebimentoRepository;
import com.aula42.listaDeProdutos.service.RecebimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RecebimentoController {

    @Autowired
    private RecebimentoService pagamentoService;

    @GetMapping(path = "/pagamento/{codigo}")
    public List<RecebimentoRepository> buscarTodosPagamento(){
        return pagamentoService.buscarTodos();
    }

    @GetMapping(path = "/pagamento/{codigo}")
    public Optional<RecebimentoRepository> buscarPorId(@PathVariable Long codigo){
        return pagamentoService.buscarId(codigo);
    }

    @PostMapping(path = "/pagamento/{codigo}")
    public PagamentoModel cadastrarPagamento(@RequestBody PagamentoModel pagamentoModel){
        return pagamentoService.cadastrar(pagamentoModel);
    }

    @PutMapping(path = "/pagamento/{codigo}")
    public PagamentoModel alterarPagamento(@RequestBody PagamentoModel pagamentoModel){
        return pagamentoService.alterar(pagamentoModel);
    }

    @DeleteMapping(path = "/pagamento/{codigo}")
    public void deletarPagamento(@PathVariable Long codigo){pagamentoService.deletar(codigo);
    }
}
