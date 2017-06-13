package com.example.nikhil.blowout;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;
import java.util.List;

public class vedio extends YouTubeBaseActivity {
    YouTubePlayerView mYouTubePlayerView;
    Button btnPlay;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vedio);
        btnPlay=(Button)findViewById(R.id.btnPlay);
        mYouTubePlayerView=(YouTubePlayerView)findViewById(R.id.youtubePlay);
        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                List<String> videoList = new ArrayList<>();
                videoList.add("fLbQfMmrISE");
                videoList.add("y3LUlag7W1s");
                videoList.add("xF6hTVxWbvY");
                videoList.add("hGpzA2qJqKM");

                youTubePlayer.loadVideos(videoList);
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mYouTubePlayerView.initialize(YouTubeConfig.getApiKey(),mOnInitializedListener);
            }
        });

    }

}
