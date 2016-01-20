package com.example.raj.volleytest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.ArrayList;

public class Cart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        ArrayList<Stationary> cart =new ArrayList<Stationary>();
        cart=getIntent().getParcelableArrayListExtra("list");

   //  cart = (ArrayList<Stationary>)getIntent().getSerializableExtra("list");
        Toast.makeText(this, cart.toString(), Toast.LENGTH_LONG).show();

    }
}
