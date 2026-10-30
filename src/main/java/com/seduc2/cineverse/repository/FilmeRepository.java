package com.seduc2.cineverse.repository;

import com.seduc2.cineverse.entity.Filmes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepository extends JpaRepository<Filmes, Long> {
}
