package com.example.rentalbazaar.Model;

public class ByCycleData {
    private String ByCycleName;
    private String ByCycleType;

    public ByCycleData(String byCycleName, String byCycleType) {
        ByCycleName = byCycleName;
        ByCycleType = byCycleType;
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
