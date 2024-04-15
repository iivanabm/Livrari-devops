package com.livraria.livrariadevops.controller;

import com.livraria.livrariadevops.domain.Livro;
import com.livraria.livrariadevops.service.LivroService;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(produces = APPLICATION_JSON_VALUE)
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping("/")
    public List<Livro> listarTodos() {
        return livroService.obterTodos();
    }

}
