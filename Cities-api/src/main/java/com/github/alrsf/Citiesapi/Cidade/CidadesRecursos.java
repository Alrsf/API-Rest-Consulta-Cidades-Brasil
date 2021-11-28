package com.github.alrsf.Citiesapi.Cidade;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cidades")
public class CidadesRecursos {

    private final CidadesRepositorio repository;

    public CidadesRecursos(final CidadesRepositorio repository) {
        this.repository = repository;
    }

    @GetMapping
    public Page<Cidades> cidades(final Pageable page) {
        return repository.findAll(page);
    }
}