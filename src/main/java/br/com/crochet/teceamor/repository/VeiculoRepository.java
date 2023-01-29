package br.com.crochet.teceamor.repository;


import br.com.crochet.teceamor.model.Veiculo;
import org.springframework.data.repository.CrudRepository;

public interface VeiculoRepository extends CrudRepository<Veiculo, Long> {


    Object listarTodos();
}