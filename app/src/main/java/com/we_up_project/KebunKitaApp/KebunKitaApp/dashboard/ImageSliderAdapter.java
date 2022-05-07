package com.we_up_project.KebunKitaApp.KebunKitaApp.dashboard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import com.makeramen.roundedimageview.RoundedImageView;
import com.we_up_project.KebunKitaApp.R;


import net.lucode.hackware.magicindicator.buildins.UIUtil;

import java.util.List;

public class ImageSliderAdapter extends RecyclerView.Adapter<ImageSliderAdapter.SliderViewHolder> {
    private List<imageSliderHelperClass>imageList;
    private ViewPager2 viewPager;

    public ImageSliderAdapter(List<imageSliderHelperClass> imageList) {
        this.imageList = imageList;
    }

    @NonNull
    @Override
    public ImageSliderAdapter.SliderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.banner_item,parent,false);
        return new SliderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageSliderAdapter.SliderViewHolder holder, int position) {
        holder.bImage.setImageResource(Integer.parseInt(imageList.get(position).getImg_slider()));
    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }

    public class SliderViewHolder extends RecyclerView.ViewHolder {
        RoundedImageView bImage;
        public SliderViewHolder(@NonNull View itemView) {
            super(itemView);
            bImage = itemView.findViewById(R.id.SliderImage);
        }
    }
}