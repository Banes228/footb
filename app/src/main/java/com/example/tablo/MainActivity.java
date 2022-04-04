package com.example.tablo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Integer mapN = 0;
    private Integer mapV = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
    }
    public void mapNavi(View view) {
        mapN++;
        TextView mapNView = findViewById(R.id.viewNaviMap);
        mapNView.setText(mapN.toString());

    }
    public void mapVitality(View view) {
        mapV++;
        TextView mapVView = findViewById(R.id.viewVitalityMap);
        mapVView.setText(mapV.toString());

    }
    public void restart(View view) {
        mapN = 0;
        mapV = 0;
        TextView mapNView = findViewById(R.id.viewNaviMap);
        mapNView.setText(mapN.toString());
        TextView mapVView = findViewById(R.id.viewVitalityMap);
        mapVView.setText(mapV.toString());
    }
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("Navi", mapN);
        outState.putInt("Vitality", mapV);
    }
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mapN = savedInstanceState.getInt("Navi");
        mapV = savedInstanceState.getInt("Vitality");
    }
}
