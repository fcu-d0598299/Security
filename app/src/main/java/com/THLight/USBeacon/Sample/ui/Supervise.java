/*package com.THLight.USBeacon.Sample.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Supervise extends Activity {
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.index);

        Button supervise = (Button)findViewById(R.id.supervise);
        supervise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Supervise.this , Supervise.class);
                startActivity(intent);
            }
        });

        Button search = (Button)findViewById(R.id.search);
        supervise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Supervise.this , UIMain.class);
                startActivity(intent);
            }
        });

    };
}
*/ // 監控介面 需新增監控介面之xml