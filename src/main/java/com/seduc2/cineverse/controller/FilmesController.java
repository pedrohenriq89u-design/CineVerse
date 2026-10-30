package com.seduc2.cineverse.controller;

import com.seduc2.cineverse.entity.Filmes;
import com.seduc2.cineverse.service.FilmeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/filmes")
public class FilmesController {

    private final FilmeService service;

    public FilmesController(FilmeService service) {
        this.service = service;
    }

    @GetMapping
    public List<Filmes> mostrarfilmes(){
        return service.mostrarfilmes();
    }

    @PostMapping
    public void cadastrarfilmes(@RequestBody Filmes filmes){
        service.cadastarfilmes(filmes);
    }
}
