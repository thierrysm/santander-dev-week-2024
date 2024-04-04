package com.tsm.santanderdevweek2024.repositories;

import com.tsm.santanderdevweek2024.domain.entities.Champion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChampionRepository extends JpaRepository<Champion, Long> {
}
