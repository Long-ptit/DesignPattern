package com.example.baseproject.singleton;
import com.example.baseproject.hero.Hero;

public class HeroSingleton {
    private static HeroSingleton instance;
    private Hero hero;


    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    private HeroSingleton() {

    }

    public static synchronized HeroSingleton getInstance() {
        if (instance == null) {
            instance = new HeroSingleton();
        }
        return instance;
    }
}
