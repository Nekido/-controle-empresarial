package br.com.crochet.teceamor.controller;


import br.com.crochet.teceamor.service.VeiculoService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VeiculoController {

    private final VeiculoService veiculoService;

    public VeiculoController(VeiculoService veiculoService) {

        this.veiculoService = veiculoService;

    }
}