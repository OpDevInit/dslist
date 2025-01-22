package com.opokaynow.dslist.DTOS;

import com.opokaynow.dslist.entities.Game;

import jakarta.persistence.Column;

public class GameMinDTO {

    private Long id;
    private Integer year;
    private String title;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(Game entity) {
        id = entity.getId();
        year = entity.getYear();
        title = entity.getTitle();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public GameMinDTO() {
    }

    public Long getId() {
        return this.id;
    }

    public Integer getYear() {
        return this.year;
    }

    public String getTitle() {
        return this.title;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public String getShortDescription() {
        return this.shortDescription;
    }

}
