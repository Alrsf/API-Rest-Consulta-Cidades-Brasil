package com.github.alrsf.Citiesapi.Estado;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estados")
public class EstadosRecursos {

    private final EstadosRepositorio repository;

    public EstadosRecursos(final EstadosRepositorio repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Estados> estados() {
        return repository.findAll();
    }
}
