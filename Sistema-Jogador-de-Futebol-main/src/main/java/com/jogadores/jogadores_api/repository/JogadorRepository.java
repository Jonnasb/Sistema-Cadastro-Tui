package com.jogadores.jogadores_api.repository;

import com.jogadores.jogadores_api.model.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogadorRepository extends JpaRepository<Jogador, Long> {
}
