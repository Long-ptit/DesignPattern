package com.example.baseproject.hero_builder;

import com.example.baseproject.hero.Equipment;
import com.example.baseproject.hero.Hero;
import com.example.baseproject.hero.HeroType;

public class AudiHeroBuilder implements Builder{

    private int lives;
    private Equipment equipment;
    private HeroType heroType;

    public AudiHeroBuilder() {
        lives = 1;
    }


    @Override
    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public void setHeroType(HeroType heroType) {
        this.heroType = heroType;
    }

    @Override
    public Hero build() {
        return new Hero( lives, equipment, heroType);
    }
}
