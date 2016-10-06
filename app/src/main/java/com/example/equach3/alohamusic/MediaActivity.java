package com.example.equach3.alohamusic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.VideoView;

public class MediaActivity extends AppCompatActivity {

    private Button ukeleleButton;
    private Button ipuButton;
    private Button hulaButton;

    private VideoView hulaVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);

        ukeleleButton = (Button) findViewById(R.id.ukeleleButton);
        ipuButton = (Button) findViewById(R.id.ipuButton);
        hulaButton = (Button) findViewById(R.id.hulaButton);

        hulaVideoView = (VideoView) findViewById(R.id.hulaVideoView);

        
    }
}
