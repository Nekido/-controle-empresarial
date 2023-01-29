package br.com.crochet.teceamor.repository;


import br.com.crochet.teceamor.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    Object listarTodos();
}