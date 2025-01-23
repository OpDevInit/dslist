package com.opokaynow.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

    //Id incorporado por 2 "sub IDs" da classe BelongingPK 
    @EmbeddedId
    private BelongingPK id = new BelongingPK();

    private Integer position;


    public Belonging() {
    }

    public Belonging(Game game, GameList gamelist, Integer position) {
        id.setGame(game);
        id.setList(gamelist);
        this.position = position;
    }


    public BelongingPK getId() {
        return this.id;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    public Integer getPosition() {
        return this.position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    

}
