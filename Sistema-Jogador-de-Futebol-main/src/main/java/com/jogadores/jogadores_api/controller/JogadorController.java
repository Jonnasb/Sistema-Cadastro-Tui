package com.jogadores.jogadores_api.controller;


import com.jogadores.jogadores_api.model.Jogador;
import com.jogadores.jogadores_api.service.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogadores")
@CrossOrigin(origins = "*")
public class JogadorController {

    @Autowired
    private JogadorService service;

    @PostMapping
    public ResponseEntity<Jogador> criar(@RequestBody Jogador jogador) {
        return ResponseEntity.ok(service.salvar(jogador));

    }

    @GetMapping
    public ResponseEntity<List<Jogador>> listar() {
        return  ResponseEntity.ok(service.listar());

    }

    @GetMapping("/{id}")
    public ResponseEntity<Jogador> buscar(@PathVariable Long id) {
        Jogador jogador = service.buscarPorId(id);
        return jogador != null ? ResponseEntity.ok(jogador) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id){
        service.excluir(id);
        return  ResponseEntity.noContent().build();
    }


}
