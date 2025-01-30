package com.opokaynow.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.opokaynow.dslist.DTOS.GameListDTO;
import com.opokaynow.dslist.DTOS.GameMinDTO;
import com.opokaynow.dslist.services.GameListServices;
import com.opokaynow.dslist.services.GameServices;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListServices listServices;

    @Autowired
    private GameServices services;

    @GetMapping
    public List<GameListDTO> FindAllGames() {
        List<GameListDTO> result = listServices.findAllGames();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> FindByList(@PathVariable Long listId) {
        List<GameMinDTO> result = services.findByList(listId);
        return result;
    }
}
