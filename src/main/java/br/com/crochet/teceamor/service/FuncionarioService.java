package br.com.crochet.teceamor.service;

import br.com.crochet.teceamor.model.Funcionario;
import br.com.crochet.teceamor.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {
    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;

    }
    public Funcionario save (Funcionario funcionario ) {

        funcionarioRepository . save ( funcionario );
        return funcionario;
    }

    public List< Funcionario > listAll () {
        return (List< Funcionario >) funcionarioRepository . listarTodos ();
    }

    public Optional<Funcionario> listById (Long  id ) {
        return  funcionarioRepository . findById ( id );
    }

    public  void  deleteById ( long id  ) {
        funcionarioRepository . deleteById ( id );
    }
}


