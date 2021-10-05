package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    private Button main_buttonNum1, main_buttonNum2, main_buttonNum3, main_buttonNum4, main_buttonNum5,
            main_buttonNum6, main_buttonNum7, main_buttonNum8, main_buttonNum9, main_buttonNum0,
            main_buttonPlus, main_buttonMinus, main_buttonTime, main_buttonDivide, main_buttonClear,
            main_buttonAmount;
    private EditText main_layoutNumbers;
    private boolean penjumlahan, pengurangan, perkalian, pembagian;
    private Double angka1, angka2;
    private String temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        main_buttonNum1 = findViewById(R.id.main_buttonNum1);
        main_buttonNum2 = findViewById(R.id.main_buttonNum2);
        main_buttonNum3 = findViewById(R.id.main_buttonNum3);
        main_buttonNum4 = findViewById(R.id.main_buttonNum4);
        main_buttonNum5 = findViewById(R.id.main_buttonNum5);
        main_buttonNum6 = findViewById(R.id.main_buttonNum6);
        main_buttonNum7 = findViewById(R.id.main_buttonNum7);
        main_buttonNum8 = findViewById(R.id.main_buttonNum8);
        main_buttonNum9 = findViewById(R.id.main_buttonNum9);
        main_buttonNum0 = findViewById(R.id.main_buttonNum0);
        main_buttonPlus = findViewById(R.id.main_buttonPlus);
        main_buttonMinus = findViewById(R.id.main_buttonMinus);
        main_buttonTime = findViewById(R.id.main_buttonTime);
        main_buttonDivide = findViewById(R.id.main_buttonDivide);
        main_buttonClear = findViewById(R.id.main_buttonClear);
        main_buttonAmount = findViewById(R.id.main_buttonAmount);
        main_layoutNumbers = findViewById(R.id.main_layoutNumbers);

        main_buttonNum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main_layoutNumbers.setText(main_layoutNumbers.getText() + "1");
            }
        });

        main_buttonNum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main_layoutNumbers.setText(main_layoutNumbers.getText() + "2");
            }
        });

        main_buttonNum3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main_layoutNumbers.setText(main_layoutNumbers.getText() + "3");
            }
        });

        main_buttonNum4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main_layoutNumbers.setText(main_layoutNumbers.getText() + "4");
            }
        });

        main_buttonNum5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main_layoutNumbers.setText(main_layoutNumbers.getText() + "5");
            }
        });

        main_buttonNum6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main_layoutNumbers.setText(main_layoutNumbers.getText() + "6");
            }
        });

        main_buttonNum7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main_layoutNumbers.setText(main_layoutNumbers.getText() + "7");
            }
        });

        main_buttonNum8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main_layoutNumbers.setText(main_layoutNumbers.getText() + "8");
            }
        });

        main_buttonNum9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main_layoutNumbers.setText(main_layoutNumbers.getText() + "9");
            }
        });

        main_buttonNum0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main_layoutNumbers.setText(main_layoutNumbers.getText() + "0");
            }
        });

        main_buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (main_layoutNumbers == null){
                    main_layoutNumbers.setText("");
                } else {
                    angka1 = Double.parseDouble(main_layoutNumbers.getText() + "");
                    penjumlahan = true;
                    main_layoutNumbers.setText(null);
                }
            }
        });

        main_buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka1 = Double.parseDouble(main_layoutNumbers.getText() + "");
                pengurangan = true;
                main_layoutNumbers.setText(null);
            }
        });

        main_buttonTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka1 = Double.parseDouble(main_layoutNumbers.getText() + "");
                perkalian = true;
                main_layoutNumbers.setText(null);
            }
        });

        main_buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka1 = Double.parseDouble(main_layoutNumbers.getText() + "");
                pembagian = true;
                main_layoutNumbers.setText(null);
            }
        });

        main_buttonAmount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka2 = Double.parseDouble(main_layoutNumbers.getText() + "");

                if (penjumlahan == true){
                    temp = String.valueOf(Double.parseDouble(angka1 + angka2 + ""));
                    penjumlahan = false;
                }

                if (pengurangan == true){
                    temp = String.valueOf(Double.parseDouble(angka1 - angka2 + ""));
                    pengurangan = false;
                }

                if (perkalian == true){
                    temp = String.valueOf(Double.parseDouble(angka1 * angka2 + ""));
                    perkalian = false;
                }

                if (pembagian == true){
                    temp = String.valueOf(Double.parseDouble(angka1 / angka2 + ""));
                    pembagian = false;
                }

                if (temp.contains(".0")){
                    temp = String.valueOf((int)Double.parseDouble(temp));
                    main_layoutNumbers.setText(temp);
                } else {
                    temp = String.valueOf(Double.parseDouble(temp));
                    main_layoutNumbers.setText(temp);
                }

            }
        });

        main_buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main_layoutNumbers.setText("");
            }
        });
    }
}