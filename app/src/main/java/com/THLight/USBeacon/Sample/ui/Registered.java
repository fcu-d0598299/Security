package com.THLight.USBeacon.Sample.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.THLight.USBeacon.Sample.ScanediBeacon;
import com.THLight.USBeacon.Sample.R;

public class Registered extends Activity {

    protected void onCreat(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.registered);

        Bundle bundle = this.getIntent().getExtras();
        String Name = bundle.getString("Name");
        TextView showname = (TextView)findViewById(R.id.uName);
        showname.setText(Name);
    }

}
