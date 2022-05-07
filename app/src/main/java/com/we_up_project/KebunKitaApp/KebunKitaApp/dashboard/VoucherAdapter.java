package com.we_up_project.KebunKitaApp.KebunKitaApp.dashboard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.we_up_project.KebunKitaApp.R;

import java.util.ArrayList;

public class VoucherAdapter extends RecyclerView.Adapter<VoucherAdapter.VoucherViewHolder> {

    ArrayList<VoucherHelperClass> voucherLocation;

    public VoucherAdapter(ArrayList<VoucherHelperClass> voucherLocation) {
        this.voucherLocation = voucherLocation;
    }

    @NonNull
    @Override
    public VoucherViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.voucher_list_item,parent,false);
        VoucherViewHolder voucherViewHolder = new VoucherViewHolder(view);
        return voucherViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull VoucherViewHolder holder, int position) {
        VoucherHelperClass voucherHelperClass = voucherLocation.get(position);
        holder.vocimg.setBackgroundResource(voucherHelperClass.getVoc_image());
    }

    @Override
    public int getItemCount() {
        return voucherLocation.size();
    }

    public static final class VoucherViewHolder extends RecyclerView.ViewHolder{

        View vocimg;

        public VoucherViewHolder(@NonNull View itemView) {
            super(itemView);
            vocimg = itemView.findViewById(R.id.vwVoucher);

        }
    }

}
