package br.com.crochet.teceamor.repository;


import br.com.crochet.teceamor.model.Despesa;
import org.springframework.data.repository.CrudRepository;

public interface DespesaRepository extends CrudRepository< Despesa, Long>{

    Object listarTodos();
}
