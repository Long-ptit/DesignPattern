package com.example.baseproject;


import com.example.baseproject.hero.Equipment;
import com.example.baseproject.hero.Hero;
import com.example.baseproject.hero.HeroType;
import com.example.baseproject.hero_builder.AudiHeroBuilder;
import com.example.baseproject.hero_builder.Builder;
import com.example.baseproject.hero_builder.MezHeroBuilder;

public class HeroDirector {

    public void createHeroNoxus(Builder builder) {
        builder.setHeroType(HeroType.NOXUS);
    }

    public void createHeroDemacia(Builder builder) {
        builder.setHeroType(HeroType.DEMACIA);
    }

    public void createHeroBigWater(Builder builder) {
        builder.setHeroType(HeroType.BIGWATER);
    }

    public void createEquipment(Builder builder, String name) {
        if (builder instanceof AudiHeroBuilder) {
            builder.setEquipment(new Equipment("Audiz " + name));
        } else if (builder instanceof MezHeroBuilder) {
            builder.setEquipment(new Equipment("Mez " + name));
        }
    }

    public Hero handleHero(Builder builder) {

        return builder.build();
    }
}
