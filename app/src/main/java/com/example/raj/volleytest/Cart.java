package com.example.raj.volleytest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.android.volley.RequestQueue;

import java.util.ArrayList;

public class Cart extends AppCompatActivity {
    ArrayList<Stationary> cart;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;
    private RequestQueue requestQueue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
         cart=new ArrayList<Stationary>();
        cart=getIntent().getParcelableArrayListExtra("list");
        recyclerView = (RecyclerView)findViewById(R.id.res);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new CartListAdapter(cart,getApplicationContext());

        recyclerView.setAdapter(adapter);
        recyclerView.setItemAnimator(null);


    }


}
