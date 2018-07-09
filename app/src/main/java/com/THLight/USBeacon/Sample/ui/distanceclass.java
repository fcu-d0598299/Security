package com.THLight.USBeacon.Sample.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Toast;

import com.THLight.USBeacon.Sample.R;

class distanceclass extends Activity {
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.distanceclass);
        Resources res = this.getResources();

        if(UIMain.distance=="dangerous")
        {
            Toast.makeText(distanceclass.this,"危險",Toast.LENGTH_SHORT).show();
        }
    }
}
