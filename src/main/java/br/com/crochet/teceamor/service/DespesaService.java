package br.com.crochet.teceamor.service;

import br.com.crochet.teceamor.model.Despesa;
import br.com.crochet.teceamor.repository.DespesaRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DespesaService {
    private final DespesaRepository despesaRepository;

    public DespesaService(DespesaRepository despesaRepository) {
        this.despesaRepository = despesaRepository;

    }
    public Despesa save (Despesa despesa ) {
        despesaRepository . save ( despesa );
        return despesa;
    }

    public List< Despesa > listAll () {
        return (List< Despesa >) despesaRepository . listarTodos ();
    }

    public Optional<Despesa> listById (Long  id ) {
        return  despesaRepository . findById ( id );
    }

    public  void  deleteById ( long id  ) {
       despesaRepository . deleteById ( id );
    }
}

