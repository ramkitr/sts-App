package com.example.sriprasath.finalsts;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        VideoView simpleview = (VideoView)findViewById(R.id.videoView2);
    simpleview.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.abc5));

    simpleview.start();

    simpleview.setOnPreparedListener(new MediaPlayer.OnPreparedListener(){
        public void onPrepared(MediaPlayer mp){
            mp.setLooping(true);
        }

    });
    }
}
