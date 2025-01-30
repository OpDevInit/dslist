package com.opokaynow.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.opokaynow.dslist.DTOS.GameListDTO;
import com.opokaynow.dslist.entities.GameList;
import com.opokaynow.dslist.repository.GameListRepository;

@Service
public class GameListServices {

    @Autowired
    private GameListRepository repository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAllGames() {

        List<GameList> result = repository.findAll();
        // Para cada game de result(x), se faz um novo GameMinDTO com os mesmos dados
        return result.stream().map(x -> new GameListDTO(x)).toList();

    }

}
