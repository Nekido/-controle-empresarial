package br.com.crochet.teceamor.controller;

import br.com.crochet.teceamor.service.UsuarioService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {

        this.usuarioService = usuarioService;
    }
}
