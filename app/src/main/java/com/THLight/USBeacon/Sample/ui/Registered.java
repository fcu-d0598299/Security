package com.THLight.USBeacon.Sample.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.THLight.USBeacon.Sample.ScanediBeacon;

import com.THLight.USBeacon.Sample.R;

import java.util.UUID;

public class Registered extends Activity {

    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.registered);
        String Name = getIntent().getStringExtra("Name");
        TextView showname = (TextView)findViewById(R.id.uName);
        showname.setText(Name);

        Bundle bundleRegister =this.getIntent().getExtras();
        TextView Mac_address = (TextView)findViewById(R.id.Mac_address);
        String mac_address = bundleRegister.getString("Mac_address");
        Mac_address.setText(mac_address);
    }

}
