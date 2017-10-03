package com.volianskyi.taras.a300917_intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {//прикріплюємо ксмл відображення
        super.onCreate(savedInstanceState);
        Log.d("LifeCycle", "OnCreate MainActivity");
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnGoToSecond).setOnClickListener(this);
    }

    @Override
    protected void onStart() {//запуск актівіті
        super.onStart();
        Log.d("LifeCycle", "onStart MainActivity");
    }

    @Override
    protected void onResume() {//
        super.onResume();
        Log.d("LifeCycle", "onResume MainActivity");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle", "onPause MainActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle", "onStop MainActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle", "onDestroy MainActivity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle", "onRestart MainActivity");
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Click", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("Test", true);
        intent.putExtra("Number", 15);
        startActivity(intent);
    }

    public void clickGoToMaps(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:65.252525,60.101010"));
        startActivity(intent);
    }

    public void openPage(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com"));
        startActivity(intent);
    }

    public void openTelephone(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:757575"));
        startActivity(intent);
    }
}
