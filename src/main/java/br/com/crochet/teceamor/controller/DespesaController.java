package br.com.crochet.teceamor.controller;

import br.com.crochet.teceamor.service.DespesaService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DespesaController {
    private final DespesaService despesaService;

    public DespesaController(DespesaService despesaService) {

        this.despesaService = despesaService;
    }
}
