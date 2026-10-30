package com.seduc2.cineverse.service;

import com.seduc2.cineverse.entity.Filmes;
import com.seduc2.cineverse.repository.FilmeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmeService {

    private final FilmeRepository filmeRepository;

    public FilmeService(FilmeRepository filmeRepository) {
        this.filmeRepository = filmeRepository;
    }

    public List<Filmes> mostrarfilmes() {
        List<Filmes> filmesList = new ArrayList<>();
        return filmesList = filmeRepository.findAll();
    }

    public void cadastarfilmes(Filmes movie) {
        Filmes filmes = new Filmes();
        filmes.setTitulo(movie.getTitulo());
        filmes.setAno(movie.getAno());
        filmes.setDiretor(movie.getDiretor());
        filmes.setPais(movie.getPais());
        filmes.setClassificacao(movie.getClassificacao());
        filmes.setSinopse(movie.getSinopse());
        filmes.setDuracao(movie.getDuracao());
        filmes.setGenero(movie.getGenero());
        filmeRepository.save(filmes);
    }
}
