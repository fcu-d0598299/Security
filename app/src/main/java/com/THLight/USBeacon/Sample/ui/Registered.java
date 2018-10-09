package com.THLight.USBeacon.Sample.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.THLight.USBeacon.Sample.R;

public class Registered extends Activity {

    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.registered);
        String Name = getIntent().getStringExtra("Name");
        TextView showname = (TextView)findViewById(R.id.uName);
        showname.setText(Name);

        String uuid = getIntent().getStringExtra("UUID");
        TextView showuuid = (TextView)findViewById(R.id.UUID);
        showuuid.setText(uuid);
    }

}
