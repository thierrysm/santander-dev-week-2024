package com.tsm.santanderdevweek2024.services.impl;

import com.tsm.santanderdevweek2024.domain.entities.Champion;
import com.tsm.santanderdevweek2024.repositories.ChampionRepository;
import com.tsm.santanderdevweek2024.services.ChampionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ChampionServiceImpl implements ChampionService{
    private ChampionRepository championRepository;

    @Override
    public List<Champion> findAll() {
        var list = championRepository.findAll();
        if (list.isEmpty()) {
            throw new RuntimeException("the list is empty");
        }
        return list;
    }
}
