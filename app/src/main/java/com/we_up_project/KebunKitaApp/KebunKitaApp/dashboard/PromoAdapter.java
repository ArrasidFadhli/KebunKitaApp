package com.we_up_project.KebunKitaApp.KebunKitaApp.dashboard;

import android.graphics.Paint;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.we_up_project.KebunKitaApp.R;

import java.util.ArrayList;

public class PromoAdapter extends RecyclerView.Adapter<PromoAdapter.PromoViewHolder> {
    ArrayList<PromoHelperClass> promoLocation;

    public PromoAdapter(ArrayList<PromoHelperClass> promoLocation) {
        this.promoLocation = promoLocation;
    }

    @NonNull
    @Override
    public PromoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.promo_list_item,parent,false);
        PromoViewHolder promoViewHolder = new PromoViewHolder(view);
        return promoViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PromoViewHolder holder, int position) {
        PromoHelperClass promoHelperClass = promoLocation.get(position);
        holder.vwPromo.setBackgroundResource(promoHelperClass.getGambar_bg());
        holder.lblPromo.setText(Integer.toString(promoHelperClass.getLblPromo()));
        holder.item.setText(promoHelperClass.getNmBarang());
        holder.potongan.setText(toRupiah(Double.toString(promoHelperClass.getPtngnHarga())));
        holder.potongan.setPaintFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        holder.harga.setText(toRupiah(Double.toString(promoHelperClass.getHarga())));
    }

    @Override
    public int getItemCount() {
        return promoLocation.size();
    }

    public static class PromoViewHolder extends RecyclerView.ViewHolder {
        View vwPromo;
        TextView lblPromo, item, potongan, harga;
        public PromoViewHolder(@NonNull View itemView) {
            super(itemView);
            vwPromo = itemView.findViewById(R.id.vwPromo);
            lblPromo = itemView.findViewById(R.id.tvPromo);
            item = itemView.findViewById(R.id.tvItem1);
            potongan = itemView.findViewById(R.id.tvStrikethrough);
            harga = itemView.findViewById(R.id.tvHarga);
        }
    }
    private String toRupiah(String nominal){
        String hasil = "";

        DecimalFormat toRupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatAngka = new DecimalFormatSymbols();

        formatAngka.setCurrencySymbol("Rp ");
        formatAngka.setMonetaryDecimalSeparator(',');
        formatAngka.setGroupingSeparator('.');
        toRupiah.setDecimalFormatSymbols(formatAngka);

        hasil = toRupiah.format(Double.valueOf(nominal));

        return hasil;
    }

}
