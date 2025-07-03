package com.jogadores.jogadores_api.service;

import com.jogadores.jogadores_api.model.Jogador;
import com.jogadores.jogadores_api.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogadorService {

    @Autowired
    private JogadorRepository repository;

    public  Jogador salvar(Jogador jogador) {
        return repository.save(jogador);
    }

    public List<Jogador> listar(){
        return repository.findAll();
    }

    public Jogador buscarPorId(Long id) {
        return  repository.findById(id).orElse(null);
    }

    public void excluir(Long id){
        repository.deleteById(id);
    }

}
