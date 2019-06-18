package com.lits.springboot.repository;

import com.lits.springboot.dtos.FootballTeamDto;
import com.lits.springboot.entity.FootballTeam;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FootballTeamRepository extends JpaRepository<FootballTeam, Integer> {

    List<FootballTeam> findByNameAndCountry(String name, String country);

}
