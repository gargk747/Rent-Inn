package com.example.rentalbazaar.BiCycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.interfaces.ItemClickListener;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.rentalbazaar.R;
import com.example.rentalbazaar.Video_Player;

import java.util.ArrayList;
import java.util.List;


public class BiCycle_clickedPreview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bi_cycle_clicked_preview);

        ImageSlider imageSlider=findViewById(R.id.biCycleClicked_image);

        List<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.cycledemo));
        slideModels.add(new SlideModel(R.drawable.demo_cycle1));
        slideModels.add(new SlideModel(R.drawable.demo_cycle2));
        slideModels.add(new SlideModel(R.drawable.demo_cycle3,"Click to Preview"));
        imageSlider.setImageList(slideModels,false);

        imageSlider.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemSelected(int i) {
                if(i==3){
                    Intent intent=new Intent(BiCycle_clickedPreview.this, Video_Player.class);
                    startActivity(intent);
                }
            }
        });
    }
}