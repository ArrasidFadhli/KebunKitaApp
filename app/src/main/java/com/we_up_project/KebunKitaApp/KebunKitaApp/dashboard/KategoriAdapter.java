package com.we_up_project.KebunKitaApp.KebunKitaApp.dashboard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.we_up_project.KebunKitaApp.R;

import java.util.ArrayList;

public class KategoriAdapter extends RecyclerView.Adapter<KategoriAdapter.KategoriViewHolder> {

    ArrayList<KategoriHelperClass> kategoriLocation;

    public KategoriAdapter( ArrayList<KategoriHelperClass> kategoriLocation) {
        this.kategoriLocation = kategoriLocation;
    }

    @NonNull
    @Override
    public KategoriViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.kategori_list_item,parent,false);
        KategoriViewHolder kategoriViewHolder = new KategoriViewHolder(view);
        return kategoriViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull KategoriViewHolder holder, int position) {
        KategoriHelperClass kategoriHelperClass = kategoriLocation.get(position);
        holder.img.setImageResource(kategoriHelperClass.getImage());
        holder.catagoryName.setText(kategoriHelperClass.getTitle());
    }

    @Override
    public int getItemCount() {
        return kategoriLocation.size();
    }

    public static final class KategoriViewHolder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView catagoryName;

        public KategoriViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.cat_img);
            catagoryName = itemView.findViewById(R.id.tvCatMenu);

        }
    }

}
