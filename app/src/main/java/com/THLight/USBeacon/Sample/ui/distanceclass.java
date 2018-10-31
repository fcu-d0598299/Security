package com.THLight.USBeacon.Sample.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.Image;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Toast;

import com.THLight.USBeacon.Sample.R;

public class distanceclass extends Activity {

    private static final int SOUND_COUNT = 2;
    private int vol;
    private SoundPool sound;

    boolean loaded = false;

    private Button alertButton;
    public static MediaPlayer mediaPlayer;

    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.distanceclass);

        ImageView warnimg = (ImageView) findViewById(R.id.imageView2);
        Resources res = this.getResources();




        if(UIMain.distance=="dangerous")
        {
            Drawable drawable = res.getDrawable(R.drawable.warnimg);
            Toast.makeText(distanceclass.this,"危險",Toast.LENGTH_SHORT).show();
            warnimg.setBackground(drawable);

            mediaPlayer = new MediaPlayer();
            mediaPlayer = MediaPlayer.create(this,R.raw.test);
            mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mediaPlayer.setLooping(true);
            mediaPlayer.start();

        }
        else if(UIMain.distance=="safe")
        {
            Intent intent = new Intent();
            intent.setClass(distanceclass.this,UIMain.class);
            startActivity(intent);

            distanceclass.mediaPlayer.stop();


        }

        alertButton = (Button)findViewById(R.id.ButtonAlert);
        alertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound.play(vol, 1, 1, 0, 0, 1);
            }
        });
    }

}

/*
    private void initializeSoundPool(){
        sound = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
        sound.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
            public void onLoadComplete(SoundPool soundPool, int sampleId,
                                       int status) {
                loaded = true;
            }
        });
        vol = sound.load(this, R.raw.test, 1);
    }

    private void playFile(){
        AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
        float actualVolume = (float) audioManager
                .getStreamVolume(AudioManager.STREAM_MUSIC);
        float maxVolume = (float) audioManager
                .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        float volume = actualVolume / maxVolume;
        if (loaded) {
            sound.play(vol, volume, volume, 1, 0, 1f);
            Log.e("Test", "Played sound");
        }
    }*/