package com.lits.springboot.service.impl;

import com.lits.springboot.dtos.FootballTeamDto;
import com.lits.springboot.entity.FootballTeam;
import com.lits.springboot.repository.FootballTeamRepository;
import com.lits.springboot.service.FootballTeamService;
import com.lits.springboot.service.mapper.FootballteamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "big")
public class BigFootballteamService implements FootballTeamService {

    @Autowired
    private FootballTeamRepository footballTeamRepository;
    @Autowired
    private FootballteamMapper footballteamMapper;

    @Override
    public FootballTeamDto getById(Integer id) {
        return null;
    }

    @Override
    public List<FootballTeamDto> getAllFootballTeam() {

        return null;
    }

    @Override
    public FootballTeamDto save(FootballTeamDto footballTeamDto ) {
        FootballTeam footballTeam = new FootballTeam();
        footballTeam.setName(footballTeamDto.getName());
        footballTeam.setTrophies(footballTeamDto.getTrophies());
        return null;
    }

    @Override
    public List<FootballTeamDto> findByNameAndCountry(String country, String name) {
        return null;
    }
}
