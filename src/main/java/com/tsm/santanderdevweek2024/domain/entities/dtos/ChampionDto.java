package com.tsm.santanderdevweek2024.domain.entities.dtos;

import com.tsm.santanderdevweek2024.domain.entities.Champion;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;

import java.beans.Beans;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChampionDto {
    private Long id;
    private String name;
    private String role;
    private String lore;
    private String imageUrl;

    public ChampionDto(Champion entity) {
        BeanUtils.copyProperties(entity, this);
    }
}
