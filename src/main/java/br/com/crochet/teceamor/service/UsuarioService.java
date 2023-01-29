package br.com.crochet.teceamor.service;

import br.com.crochet.teceamor.model.Usuario;
import br.com.crochet.teceamor.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;

    }
    public  Usuario  save ( Usuario usuario ) {

         usuarioRepository . save ( usuario );
         return usuario;
    }

    public  List < Usuario > listAll () {
        return (List< Usuario >) usuarioRepository . listarTodos ();
    }

    public Optional<Usuario> listById (Long  id ) {
        return  usuarioRepository . findById ( id );
    }

    public  void  deleteById ( long id  ) {
        usuarioRepository . deleteById ( id );
    }
}
