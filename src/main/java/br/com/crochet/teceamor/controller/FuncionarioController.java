package br.com.crochet.teceamor.controller;

import br.com.crochet.teceamor.service.FuncionarioService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FuncionarioController {

    private final FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService) {

        this.funcionarioService = funcionarioService;
    }
}
