package com.dev.mysoko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class GroceryActivity extends AppCompatActivity {
    TextView amount;
    TextView fruit;
    TextView fruit2;
    TextView fruit3;
    TextView fruit4;
    TextView fruit5;
    TextView mgPr;
    TextView mgPr2;
    TextView mgPr3;
    TextView mgPr4;
    TextView mgPr5;
    TextView name;
    FloatingActionButton add;
    FloatingActionButton add2;
    FloatingActionButton add3;
    FloatingActionButton add4;
    FloatingActionButton add5;
    ImageView cart;
    ArrayList<String> arrayList = new ArrayList<>();
    String  total="0";
    int tot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grocery);
        amount = findViewById(R.id.amt);
        add= findViewById(R.id.fbMango);
        add2= findViewById(R.id.fbCococnut);
        add3= findViewById(R.id.fbPine);
        add4= findViewById(R.id.fbBanana);
        add5= findViewById(R.id.fbStraw);
        cart = findViewById(R.id.cart);
        fruit = findViewById(R.id.mango);
        fruit2 = findViewById(R.id.coconut);
        fruit3 = findViewById(R.id.pine);
        fruit4 = findViewById(R.id.banana);
        fruit5 = findViewById(R.id.strawb);
        mgPr = findViewById(R.id.mangoPrice);
        mgPr2 = findViewById(R.id.coconutPrice);
        mgPr3 = findViewById(R.id.pinePrice);
        mgPr4 = findViewById(R.id.banaPrice);
        mgPr5 = findViewById(R.id.strawPrice);
        name = findViewById(R.id.name);
        Intent intent = getIntent();
        String usrname = intent.getStringExtra("username");
        name.setText("Hi," + usrname);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int amt= Integer.parseInt(amount.getText().toString());
                String itmAmount = String.valueOf((amt +1));
                amount.setText(itmAmount);
                String itm = fruit.getText().toString() + " " +" " + "Ksh." + mgPr.getText().toString();
                tot += Integer.parseInt(mgPr.getText().toString());
                total = String.valueOf((tot));
                arrayList.add(itm);
            }
        });
        add2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int amt= Integer.parseInt(amount.getText().toString());
                String itmAmount = String.valueOf((amt +1));
                amount.setText(itmAmount);
                String itm = fruit2.getText().toString() + " " +" " + "Ksh." + mgPr2.getText().toString();
                tot += Integer.parseInt(mgPr2.getText().toString());
                total = String.valueOf((tot));
                arrayList.add(itm);
            }
        });
        add3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int amt= Integer.parseInt(amount.getText().toString());
                String itmAmount = String.valueOf((amt +1));
                amount.setText(itmAmount);
                String itm = fruit3.getText().toString() + " " +" " + "Ksh." + mgPr3.getText().toString();
                tot += Integer.parseInt(mgPr3.getText().toString());
                total = String.valueOf((tot));
                arrayList.add(itm);
            }
        });
        add4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int amt= Integer.parseInt(amount.getText().toString());
                String itmAmount = String.valueOf((amt +1));
                amount.setText(itmAmount);
                String itm = fruit4.getText().toString() + " " +" " + "Ksh." + mgPr4.getText().toString();
                tot += Integer.parseInt(mgPr4.getText().toString());
                total = String.valueOf((tot));
                arrayList.add(itm);
            }
        });
        add5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int amt= Integer.parseInt(amount.getText().toString());
                String itmAmount = String.valueOf((amt +1));
                amount.setText(itmAmount);
                String itm = fruit5.getText().toString() + " " +" " + "Ksh." + mgPr5.getText().toString();
                tot += Integer.parseInt(mgPr5.getText().toString());
                total = String.valueOf((tot));
                arrayList.add(itm);
            }
        });
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GroceryActivity.this, CheckoutActivity.class);
                intent.putExtra("items",arrayList);
                intent.putExtra("totals",total);
                startActivity(intent);
            }
        });
    }
}