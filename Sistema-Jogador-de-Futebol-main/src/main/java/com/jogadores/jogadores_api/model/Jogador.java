package com.jogadores.jogadores_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Jogador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String Nome;
    private String Sexo;
    private String Idade;
    private Float Altura;
    private Float Peso;
    private String Posicao;
    private String numeroCamisa;




}
