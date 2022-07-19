package com.example.baseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import com.example.baseproject.hero.Hero;
import com.example.baseproject.singleton.HeroSingleton;

public class DetailHeroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hero);
        HeroSingleton heroSingleton = HeroSingleton.getInstance();
        Hero hero = heroSingleton.getHero();
        TextView textView = findViewById(R.id.tv_data);
        textView.setText(hero.toString());
    }
}