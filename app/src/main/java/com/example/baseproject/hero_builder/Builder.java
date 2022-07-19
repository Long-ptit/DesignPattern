package com.example.baseproject.hero_builder;


import com.example.baseproject.hero.Equipment;
import com.example.baseproject.hero.Hero;
import com.example.baseproject.hero.HeroType;

public interface Builder {

    void setEquipment(Equipment equipment);
    void setHeroType(HeroType heroType);
    Hero build();
}
