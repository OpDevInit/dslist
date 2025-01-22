package com.opokaynow.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.opokaynow.dslist.DTOS.GameMinDTO;
import com.opokaynow.dslist.entities.Game;
import com.opokaynow.dslist.repository.GameRepository;

@Service
public class GamesServices {

    @Autowired
    private GameRepository repository;

    public List<GameMinDTO> findAllGames() {
        List<Game> result = repository.findAll();
        // Para cada game de result(x), se faz um novo GameMinDTO com os mesmos dados
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
