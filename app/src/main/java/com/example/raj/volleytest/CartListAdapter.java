package com.example.raj.volleytest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by raj on 21/1/16.
 */
public class CartListAdapter extends RecyclerView.Adapter<CartListAdapter.ViewHolder>{
    Context context;
    ArrayList<Stationary> list;
    public CartListAdapter(ArrayList<Stationary> list,Context context) {
        this.list=list;
        this.context=context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Stationary st= list.get(position);
        holder.name.setText(st.getName().toString());
        holder.qty.setText(st.getQty().toString());
        holder.price.setText(st.getPrice().toString());



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView name,qty,price;
        public ViewHolder(View itemView) {
            super(itemView);
            name=(TextView)itemView.findViewById(R.id.n);
            price=(TextView)itemView.findViewById(R.id.p);
            qty=(TextView)itemView.findViewById(R.id.q);
        }
    }
}
