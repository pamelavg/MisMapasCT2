package com.krivic.mismapast2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

    }

    public void goToMaps(View v){
        Intent intent = new Intent(StartActivity.this,MapsActivity.class);
        switch (v.getId()){

            case R.id.zooImg:
                intent.putExtra("lat",-12.072024298807221);
                intent.putExtra("long",-77.0869072602202);
                intent.putExtra("titleMarker","Zoologico de Lima");
            break;
            case R.id.sanImg:
                intent.putExtra("lat",-12.126315414049614);
                intent.putExtra("long",-77.03599215891995);
                intent.putExtra("titleMarker","Parque del Amor");
            break;
            case R.id.catImg:
                intent.putExtra("lat",-12.12347441758414);
                intent.putExtra("long",-77.04012014726892);
                intent.putExtra("titleMarker","Costa Verde");
            break;
            case R.id.kingImg:
                intent.putExtra("lat",-12.062714112020988);
                intent.putExtra("long",-77.03573272387281);
                intent.putExtra("titleMarker","Parque de la Exposicion");
            break;
        }
        startActivity(intent);
    }
}
