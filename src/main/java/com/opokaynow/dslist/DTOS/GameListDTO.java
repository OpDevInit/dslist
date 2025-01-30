package com.opokaynow.dslist.DTOS;

import com.opokaynow.dslist.entities.GameList;

public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO() {
    }

    public GameListDTO(GameList list) {

        this.id = list.getId();
        this.name = list.getName();

    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

}
