package com.example.baseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.baseproject.hero_builder.AudiHeroBuilder;
import com.example.baseproject.hero_builder.Builder;
import com.example.baseproject.hero_builder.MezHeroBuilder;
import com.example.baseproject.singleton.HeroSingleton;


public class MainActivity extends AppCompatActivity {

    private Spinner mSpHeroType, mSpHeroBranch;
    private Button mBtnSendToDetail;
    private EditText mEdtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        mBtnSendToDetail.setOnClickListener(v -> sendData());
    }

    private void initView() {
        mSpHeroType = findViewById(R.id.sp_hero_ype);
        mSpHeroBranch = findViewById(R.id.sp_hero_branch);
        mBtnSendToDetail = findViewById(R.id.btn_send);
        mEdtName = findViewById(R.id.edt_name_equipment);
    }

    private void sendData() {
        Builder builder;
        if (mSpHeroBranch.getSelectedItemPosition() == 0) {
            builder = new MezHeroBuilder();
        } else {
            builder = new AudiHeroBuilder();
        }


        HeroDirector heroDirector = new HeroDirector();
        switch (mSpHeroType.getSelectedItemPosition()) {
            case 0:
                heroDirector.createHeroNoxus(builder);
                break;
            case 1:
                heroDirector.createHeroDemacia(builder);
                break;
            case 2:
                heroDirector.createHeroBigWater(builder);
                break;

        }
        if (!TextUtils.isEmpty(mEdtName.getText().toString())) {
            heroDirector.createEquipment(builder, mEdtName.getText().toString());
        }

        HeroSingleton heroSingleton = HeroSingleton.getInstance();
        heroSingleton.setHero(heroDirector.handleHero(builder));

        Intent intent = new Intent(this, DetailHeroActivity.class);
        startActivity(intent);
    }
}