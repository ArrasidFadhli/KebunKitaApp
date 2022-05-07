package com.we_up_project.KebunKitaApp.KebunKitaApp.dashboard;
import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.graphics.Color;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.we_up_project.KebunKitaApp.R;

import java.util.ArrayList;

public class MenuHarianAdapter extends RecyclerView.Adapter<MenuHarianAdapter.MenuHarianViewHolder>{
ArrayList<MenuHarianHelperClass> menuHarianLocation;
int row_index = 0;

public MenuHarianAdapter(ArrayList<MenuHarianHelperClass> menuHarianLocation) {
    this.menuHarianLocation = menuHarianLocation;
}

    @NonNull
    @Override
    public MenuHarianViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_harian_list,parent,false);
        MenuHarianViewHolder menuHarianViewHolder  = new MenuHarianViewHolder(view);
        return menuHarianViewHolder;
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull MenuHarianViewHolder holder, @SuppressLint("RecyclerView") int position) {
        MenuHarianHelperClass menuHarianHelperClass = menuHarianLocation.get(position);
        holder.tvHari.setText(menuHarianHelperClass.getHari());
        holder.vwMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                row_index = position;
                notifyDataSetChanged();
            }
        });

        if (row_index==position) {
            holder.vwMenu.setBackgroundResource(R.drawable.ic_green_bg);
        } else {
            holder.vwMenu.setBackgroundResource(R.drawable.ic_corner_bg);
        }
        holder.tvHari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                row_index = position;
                notifyDataSetChanged();
            }
        });

        if (row_index==position) {
            holder.tvHari.setTextColor(Color.WHITE);
        } else {
            holder.tvHari.setTextColor(Color.BLACK);
        }

    }

    @Override
    public int getItemCount() {
        return menuHarianLocation.size();
    }

    public static class MenuHarianViewHolder extends RecyclerView.ViewHolder{
    View vwMenu;
    TextView tvHari;
    public MenuHarianViewHolder(@NonNull View itemView) {
        super(itemView);
        //hooks
        vwMenu = itemView.findViewById(R.id.vwMenuHarian);
        tvHari = itemView.findViewById(R.id.tvMenuHarian);

    }
}
}
