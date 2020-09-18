package com.example.rentalbazaar.Model;

import android.content.Intent;

public class BiCycleData {
    private String ByCycleName;
    private String ByCycleType;
    private Integer ByCycleImage;

    public BiCycleData(String byCycleName, String byCycleType, Integer byCycleImage) {
        ByCycleName = byCycleName;
        ByCycleType = byCycleType;
        ByCycleImage=byCycleImage;
    }

    public Integer getByCycleImage() {
        return ByCycleImage;
    }

    public void setByCycleImage(Integer byCycleImage) {
        ByCycleImage = byCycleImage;
    }

    public String getByCycleName() {
        return ByCycleName;
    }

    public void setByCycleName(String byCycleName) {
        ByCycleName = byCycleName;
    }

    public String getByCycleType() {
        return ByCycleType;
    }

    public void setByCycleType(String byCycleType) {
        ByCycleType = byCycleType;
    }
}
