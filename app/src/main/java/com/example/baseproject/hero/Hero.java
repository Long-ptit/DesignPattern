package com.example.baseproject.hero;

public class Hero {

    private int lives;
    private Equipment equipment;
    private HeroType heroType;

    public int getLives() {
        return lives;
    }

    public Hero(int lives, Equipment equipment, HeroType heroType) {
        this.lives = lives;
        this.equipment = equipment;
        this.heroType = heroType;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public HeroType getHeroType() {
        return heroType;
    }

    public void setHeroType(HeroType heroType) {
        this.heroType = heroType;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "lives=" + lives +
                ", equipment=" + equipment +
                ", heroType=" + heroType +
                '}';
    }
}
