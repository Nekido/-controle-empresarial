package br.com.crochet.teceamor.repository;


import br.com.crochet.teceamor.model.Funcionario;
import org.springframework.data.repository.CrudRepository;



    public interface FuncionarioRepository extends CrudRepository <Funcionario, Long> {
        Object listarTodos();
    }
