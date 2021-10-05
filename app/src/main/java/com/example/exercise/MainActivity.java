package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView main_backgroundWallpaper, main_profilePicture, main_background1, main_background2, main_background3;
    private RadioGroup main_radioButton;
    private RadioButton main_pandaButton, main_dogButton, main_penguinButton;
    private Button main_saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_backgroundWallpaper =findViewById(R.id.main_backgroundWallpaper);
        main_profilePicture =findViewById(R.id.main_profilePicture);
        main_background1 =findViewById(R.id.main_background1);
        main_background2 =findViewById(R.id.main_background2);
        main_background3 =findViewById(R.id.main_background3);
        main_radioButton =findViewById(R.id.main_radioButton);
        main_pandaButton =findViewById(R.id.main_pandaButton);
        main_dogButton =findViewById(R.id.main_dogButton);
        main_penguinButton =findViewById(R.id.main_penguinButton);
        main_saveButton =findViewById(R.id.main_saveButton);

        main_pandaButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                main_profilePicture.setImageResource(R.drawable.panda);
            }
        });

        main_dogButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                main_profilePicture.setImageResource(R.drawable.doggo);
            }
        });

        main_penguinButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                main_profilePicture.setImageResource(R.drawable.penguin);
            }
        });

        main_background1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                main_backgroundWallpaper.setImageResource(R.drawable.background1);
            }
        });

        main_background2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                main_backgroundWallpaper.setImageResource(R.drawable.background2);
            }
        });

        main_background3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                main_backgroundWallpaper.setImageResource(R.drawable.background3);
            }
        });

        main_saveButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "Profile Updated!", Toast.LENGTH_LONG).show();
            }
        });
    }
}