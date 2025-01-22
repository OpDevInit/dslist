package com.opokaynow.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.opokaynow.dslist.DTOS.GameMinDTO;
import com.opokaynow.dslist.services.GamesServices;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GamesServices services;

    @GetMapping
    public List<GameMinDTO> FindAllGames() {
        List<GameMinDTO> result = services.findAllGames();

        return result;
    }

}
