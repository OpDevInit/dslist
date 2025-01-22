package com.opokaynow.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.opokaynow.dslist.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game,Long>{



}
