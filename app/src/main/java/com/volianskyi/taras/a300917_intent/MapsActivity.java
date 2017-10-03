package com.volianskyi.taras.a300917_intent;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MapsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        TextView textView = (TextView) findViewById(R.id.tvTextMapsActivity);
        Uri data = getIntent().getData();
        textView.setText(data.toString());
    }
}
