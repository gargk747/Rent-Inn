package com.example.rentalbazaar;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video_Player extends AppCompatActivity {

    VideoView videoView;
    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video__player);

        mediaController= new MediaController(this);

        String videoPath= "android.resource://com.example.rentalbazaar/" +R.raw.firstvideo;
        Uri uri=Uri.parse(videoPath);
        videoView.setVideoPath(videoPath);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        videoView.start();

    }
}