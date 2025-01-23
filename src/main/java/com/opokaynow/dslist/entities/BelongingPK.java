package com.opokaynow.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelongingPK {


    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList list;

    public BelongingPK(Game game, GameList list) {
        this.game = game;
        this.list = list;
    }

    public BelongingPK() {
    }

    public Game getGame() {
        return this.game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameList getList() {
        return this.list;
    }

    public void setList(GameList list) {
        this.list = list;
    }

    
    
}
