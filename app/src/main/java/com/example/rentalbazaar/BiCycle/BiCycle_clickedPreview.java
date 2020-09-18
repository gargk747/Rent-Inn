package com.example.rentalbazaar.BiCycle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.rentalbazaar.R;

import java.util.ArrayList;
import java.util.List;


public class BiCycle_clickedPreview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bi_cycle_clicked_preview);

        ImageSlider imageSlider=findViewById(R.id.biCycleClicked_image);

        List<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.background));
        slideModels.add(new SlideModel(R.drawable.background));
        slideModels.add(new SlideModel(R.drawable.background));
        slideModels.add(new SlideModel(R.drawable.background));
        imageSlider.setImageList(slideModels,false);
    }
}