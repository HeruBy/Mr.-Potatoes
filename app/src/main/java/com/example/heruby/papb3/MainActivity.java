package com.example.heruby.papb3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView arms , glasses , ears , eyebrows , eyes , hat , mouth, mustache , nose , shoes;
    CheckBox Cbarms , Cbglasses , Cbears , Cbeyebrows , Cbeyes , Cbhat , Cbmouth, Cbmustache , Cbnose , Cbshoes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arms = (ImageView) findViewById(R.id.arms);
        glasses = (ImageView) findViewById(R.id.glasses);
        ears = (ImageView) findViewById(R.id.ears);
        eyebrows = (ImageView) findViewById(R.id.eyebrows);
        eyes = (ImageView) findViewById(R.id.eyes);
        hat = (ImageView) findViewById(R.id.hat);
        mouth = (ImageView) findViewById(R.id.mouth);
        mustache = (ImageView) findViewById(R.id.mustache);
        nose = (ImageView) findViewById(R.id.nose);
        shoes = (ImageView) findViewById(R.id.shoes);

        Cbarms = (CheckBox) findViewById(R.id.CbArms);
        Cbglasses = (CheckBox) findViewById(R.id.CbGlasses);
        Cbears = (CheckBox) findViewById(R.id.CbEars);
        Cbeyebrows = (CheckBox) findViewById(R.id.CbBrows);
        Cbeyes = (CheckBox) findViewById(R.id.CbEyes);
        Cbhat = (CheckBox) findViewById(R.id.CbHat);
        Cbmouth = (CheckBox) findViewById(R.id.CbMouth);
        Cbmustache = (CheckBox) findViewById(R.id.CbMustache);
        Cbnose = (CheckBox) findViewById(R.id.CbNose);
        Cbshoes = (CheckBox) findViewById(R.id.CbShoes);

        Cbarms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Cbarms.isChecked())
                {
                    arms.setVisibility(View.VISIBLE);
                }
                else
                {
                    arms.setVisibility(View.INVISIBLE);
                }
            }
        });

        Cbglasses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Cbglasses.isChecked())
                {
                    glasses.setVisibility(View.VISIBLE);
                }
                else
                {
                    glasses.setVisibility(View.INVISIBLE);
                }
            }
        });

        Cbears.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Cbears.isChecked())
                {
                    ears.setVisibility(View.VISIBLE);
                }
                else
                {
                    ears.setVisibility(View.INVISIBLE);
                }
            }
        });

        Cbeyebrows.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Cbeyebrows.isChecked())
                {
                    eyebrows.setVisibility(View.VISIBLE);
                }
                else
                {
                    eyebrows.setVisibility(View.INVISIBLE);
                }
            }
        });

        Cbeyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Cbeyes.isChecked())
                {
                    eyes.setVisibility(View.VISIBLE);
                }
                else
                {
                    eyes.setVisibility(View.INVISIBLE);
                }
            }
        });

        Cbhat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Cbhat.isChecked())
                {
                    hat.setVisibility(View.VISIBLE);
                }
                else
                {
                    hat.setVisibility(View.INVISIBLE);
                }
            }
        });

        Cbmouth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Cbmouth.isChecked())
                {
                    mouth.setVisibility(View.VISIBLE);
                }
                else
                {
                    mouth.setVisibility(View.INVISIBLE);
                }
            }
        });

        Cbmustache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Cbmustache.isChecked())
                {
                    mustache.setVisibility(View.VISIBLE);
                }
                else
                {
                    mustache.setVisibility(View.INVISIBLE);
                }
            }
        });

        Cbnose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Cbnose.isChecked())
                {
                    nose.setVisibility(View.VISIBLE);
                }
                else
                {
                    nose.setVisibility(View.INVISIBLE);
                }
            }
        });

        Cbshoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Cbshoes.isChecked())
                {
                    shoes.setVisibility(View.VISIBLE);
                }
                else
                {
                    shoes.setVisibility(View.INVISIBLE);
                }
            }
        });

    }
}
