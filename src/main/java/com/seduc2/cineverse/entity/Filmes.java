package com.seduc2.cineverse.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Filmes {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titulo;
    private Integer ano;
    private String genero;
    private String diretor;
    @Column(columnDefinition = "TEXT")
    private String sinopse;
    private String pais;
    private Integer duracao;
    private String classificacao;

    public Filmes() {}

    public Filmes(long id, String titulo, Integer ano, String genero, String diretor, String sinopse, String pais, Integer duracao, String classificacao) {
        this.id = id;
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.diretor = diretor;
        this.sinopse = sinopse;
        this.pais = pais;
        this.duracao = duracao;
        this.classificacao = classificacao;
    }

    public Filmes(String titulo, Integer ano, String genero, String diretor, String sinopse, String pais, Integer duracao, String classificacao) {
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.diretor = diretor;
        this.sinopse = sinopse;
        this.pais = pais;
        this.duracao = duracao;
        this.classificacao = classificacao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
}
