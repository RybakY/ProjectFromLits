package com.lits.springboot.web;

import com.lits.springboot.dtos.FootballTeamDto;
import com.lits.springboot.entity.FootballTeam;
import com.lits.springboot.service.FootballTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping(value = "/api")
public class FootballteamController {


    @Autowired
    @Qualifier("big")
    private FootballTeamService bigfootballTeamService;

    @Autowired
    @Qualifier("small")
    private FootballTeamService smallfootballTeamService;



    @PostMapping
    public FootballTeamDto saveFootballteam(@RequestBody FootballTeamDto footballTeamDto){
        return smallfootballTeamService.save(footballTeamDto);
    }

    @GetMapping(value = "/footballTeam")
    public FootballTeamDto getFootballteamById(@RequestParam Integer id){
        return smallfootballTeamService.getById(id);
    }

    @GetMapping(value = "/allFootballTeam")
    public List <FootballTeamDto> getAllFootballTeam(){
        return smallfootballTeamService.getAllFootballTeam();
    }

    @GetMapping(value = "/footballTeamlist")
    public List<FootballTeamDto>findByCountryAndName(@RequestParam String name, @RequestParam String country ){
        return smallfootballTeamService.findByNameAndCountry(name, country);
    }

}
