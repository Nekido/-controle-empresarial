package br.com.crochet.teceamor.service;

import br.com.crochet.teceamor.model.Veiculo;
import br.com.crochet.teceamor.repository.VeiculoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService {
    private final VeiculoRepository veiculoRepository;

    public VeiculoService(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;

    }
    public Veiculo saveVeiculo (Veiculo  veiculo ) {

       veiculoRepository . save ( veiculo );
       return veiculo;
    }

    public List< Veiculo > listarVeiculo () {
        return ( List < Veiculo >) veiculoRepository . listarTodos ();
    }
    public Optional<Veiculo> listarVeiculosPorId (Long  id ) {
        return  veiculoRepository . findById(id);
    }
    public  void  deletarVeiculosPorId ( Long id  ) {
        veiculoRepository . deleteById ( id );
    }

}

