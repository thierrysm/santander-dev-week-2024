package com.tsm.santanderdevweek2024.services;

import com.tsm.santanderdevweek2024.domain.entities.Champion;
import com.tsm.santanderdevweek2024.repositories.ChampionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ChampionService{
    List<Champion> findAll();
}
