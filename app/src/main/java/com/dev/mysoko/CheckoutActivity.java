package com.dev.mysoko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CheckoutActivity extends AppCompatActivity {
    ListView listView;
    TextView grandT;
    Button checkout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout_activivty);
        listView = findViewById(R.id.list);
        grandT = findViewById(R.id.grand);
        Intent intent = getIntent();
        String total= intent.getStringExtra("totals");
        grandT.setText("Ksh."+ total);
        ArrayList<String> fd = (ArrayList<String>) intent.getSerializableExtra("items");
        Log.e("TAG","Array"+fd);
        List<String> arrayList = new ArrayList<>();
        arrayList.addAll(fd);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
        checkout = findViewById(R.id.check);
        int tots = Integer.parseInt(total);
        if (tots> 1000){
            checkout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent1 = new Intent(CheckoutActivity.this,RewardActivity.class);
                    startActivity(intent1);
                }
            });
        }else
            checkout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(CheckoutActivity.this, "Order Complete!", Toast.LENGTH_SHORT).show();
                }
            });
    }
}