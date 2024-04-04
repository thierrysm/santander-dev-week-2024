package com.tsm.santanderdevweek2024.controllers;

import com.tsm.santanderdevweek2024.domain.entities.Champion;
import com.tsm.santanderdevweek2024.domain.entities.dtos.ChampionDto;
import com.tsm.santanderdevweek2024.services.impl.ChampionServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/champions")
@AllArgsConstructor
public class ChampionResource {

    private ChampionServiceImpl championService;

    @GetMapping
    public ResponseEntity<List<ChampionDto>> findAll() {
        var list = championService.findAll();
        return ResponseEntity.ok().body(list);
    }
}
