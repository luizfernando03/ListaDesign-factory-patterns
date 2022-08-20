package com.aula42.listaDeProdutos.repository;

import com.aula42.listaDeProdutos.model.PagamentoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<PagamentoModel, Long> {

}
