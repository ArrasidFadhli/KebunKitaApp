package com.we_up_project.KebunKitaApp.KebunKitaApp.dashboard;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.we_up_project.KebunKitaApp.R;

import java.util.ArrayList;

    public class RekomendasiAdapter extends RecyclerView.Adapter<RekomendasiAdapter.RekomendasiViewHolder>{
    ArrayList<RekomendasiHelperClass> rekomendasiLocation;

    public RekomendasiAdapter(ArrayList<RekomendasiHelperClass> rekomendasiLocation) {
        this.rekomendasiLocation = rekomendasiLocation;
    }

        @NonNull
        @Override
        public RekomendasiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rekomendasi_list_item,parent,false);
            RekomendasiViewHolder rekomendasiViewHolder  = new RekomendasiViewHolder(view);
            return rekomendasiViewHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull RekomendasiViewHolder holder, int position) {
            RekomendasiHelperClass rekomendasiHelperClass = rekomendasiLocation.get(position);
            holder.view.setBackgroundResource(rekomendasiHelperClass.getImg());
            holder.judul.setText(rekomendasiHelperClass.getJudulItem());
            holder.harga.setText(rekomendasiHelperClass.getPrice());
        }

        @Override
        public int getItemCount() {
            return rekomendasiLocation.size();
        }

        public static class RekomendasiViewHolder extends RecyclerView.ViewHolder{
        View view;
        TextView judul, harga;
        public RekomendasiViewHolder(@NonNull View itemView) {
            super(itemView);
            //hooks
            view = itemView.findViewById(R.id.vwItem);
            judul = itemView.findViewById(R.id.tvItem);
            harga = itemView.findViewById(R.id.tvHarga);
        }
    }
}
