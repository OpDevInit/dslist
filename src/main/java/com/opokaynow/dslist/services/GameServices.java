package com.opokaynow.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.opokaynow.dslist.DTOS.GameDTO;
import com.opokaynow.dslist.DTOS.GameMinDTO;
import com.opokaynow.dslist.entities.Game;
import com.opokaynow.dslist.projections.GameMinProjection;
import com.opokaynow.dslist.repository.GameRepository;


@Service
public class GameServices {

    @Autowired
    private GameRepository repository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAllGames() {
        List<Game> result = repository.findAll();
        // Para cada game de result(x), se faz um novo GameMinDTO com os mesmos dados
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }

    @Transactional(readOnly = true)
    public GameDTO findGameById(Long id) {
        Game result = repository.findById(id).get();
        return new GameDTO(result);
    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId) {
        List<GameMinProjection> result = repository.searchByList(listId);
        // Para cada game de result(x), se faz um novo GameMinDTO com os mesmos dados
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }
}
