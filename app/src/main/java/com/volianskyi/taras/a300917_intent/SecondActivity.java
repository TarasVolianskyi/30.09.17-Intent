package com.volianskyi.taras.a300917_intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("LifeCycle", "OnCreate SecondActivity");
        boolean value = getIntent().getBooleanExtra("Test", true);
        int numberValue = getIntent().getIntExtra("Number", 0);
        TextView tv = (TextView) findViewById(R.id.tvSecond);
        tv.setText("Value is - " + value + "value number - " + numberValue);
        ListView lvMain = (ListView) findViewById(R.id.lvMainListSecondActivity);
      //final String[] array = new String[]{"one","two","three"};
        final String[] array = getResources().getStringArray(R.array.names);
                ArrayAdapter<String> arrayAdapter  = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array);
        lvMain.setAdapter(arrayAdapter);
        lvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(SecondActivity.this, "click on item"+array[i], Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    protected void onStart() {//запуск актівіті
        super.onStart();
        Log.d("LifeCycle", "onStart SecondActivity");
    }

    @Override
    protected void onResume() {//
        super.onResume();
        Log.d("LifeCycle", "onResume SecondActivity");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle", "onPause SecondActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle", "onStop SecondActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle", "onDestroy SecondActivity");
    }

}
