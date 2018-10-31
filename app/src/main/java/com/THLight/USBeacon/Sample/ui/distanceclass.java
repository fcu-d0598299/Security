package com.THLight.USBeacon.Sample.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.Image;
import android.media.SoundPool;
import android.os.Bundle;
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


    private Button alertButton;


    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.distanceclass);

        ImageView warnimg = (ImageView) findViewById(R.id.imageView2);
        Resources res = this.getResources();

        sound = new SoundPool(10, AudioManager.STREAM_MUSIC, 5);
        vol = sound.load(this,R.raw.test,1);


        if(UIMain.distance=="dangerous")
        {
            Drawable drawable = res.getDrawable(R.drawable.warnimg);
            Toast.makeText(distanceclass.this,"危險",Toast.LENGTH_SHORT).show();
            warnimg.setBackground(drawable);
            sound.autoResume();
        }
        else if(UIMain.distance=="safe")
        {
            Intent intent = new Intent();
            intent.setClass(distanceclass.this,UIMain.class);
            startActivity(intent);

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

